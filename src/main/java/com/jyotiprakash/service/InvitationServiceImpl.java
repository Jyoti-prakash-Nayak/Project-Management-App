package com.jyotiprakash.service;

import com.jyotiprakash.modal.Invitation;
import com.jyotiprakash.repository.InvitationRepository;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InvitationServiceImpl implements InvitationService{
    @Autowired
    private InvitationRepository invitationRepository;

    @Autowired
    private EmailService emailService;

    @Override
    public void sendInvitation(String email, Long projectId) throws MessagingException {
        // Generate unique invitation token
        String invitationToken = UUID.randomUUID().toString();

        // Save invitation to the database
        Invitation invitation = new Invitation();
        invitation.setEmail(email);
        invitation.setProjectId(projectId);
        invitation.setToken(invitationToken);
        invitationRepository.save(invitation);


        String invitationLink = "http://localhost:5173/accept_invitation?token=" + invitationToken;
        emailService.sendEmailWithToken(email, invitationLink);

    }

    @Override
    public Invitation acceptInvitation(String token, Long userId) throws Exception {
        Invitation invitation = invitationRepository.findByToken(token);

        if (invitation == null) {
            throw new Exception("Invalid invitation token") ;
        }

        return invitation;
    }


    @Override
    public String getTokenByUserMail(String userEmail) {
        Invitation token= invitationRepository.findByEmail(userEmail);
        return token.getToken();
    }

    @Override
    public void deleteToken(String token) {
        invitationRepository.deleteByToken(token);
    }
}
