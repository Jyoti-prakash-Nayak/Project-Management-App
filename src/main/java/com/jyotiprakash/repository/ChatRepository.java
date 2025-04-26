package com.jyotiprakash.repository;

import com.jyotiprakash.modal.Chat;
import com.jyotiprakash.modal.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat,Long> {
    Chat findByProject(Project projectById);
}
