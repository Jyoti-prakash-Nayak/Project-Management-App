package com.jyotiprakash.service;

import com.jyotiprakash.modal.Chat;
import com.jyotiprakash.modal.Project;
import com.jyotiprakash.modal.User;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project,Long userId)throws Exception;

    List<Project> getProjectByTeam(User user, String category, String tag)throws Exception;

    Project getProjectById(Long projectId)throws Exception;

    String deleteProject(Long projectId,Long userId)throws Exception;

    Project updateProject(Project updatedProject,Long id)throws Exception;
    List<Project> searchProjects(String keyword, User user) throws Exception;
    void addUserToProject(Long projectId,Long userId)throws Exception;
    void removeUserFromProject(Long projectId,Long userId)throws Exception;

    Chat getChatByProjectId(Long projectId) throws Exception;
}
