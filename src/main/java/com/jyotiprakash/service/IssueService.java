package com.jyotiprakash.service;

import com.jyotiprakash.modal.Issue;
import com.jyotiprakash.modal.User;
import com.jyotiprakash.request.IssueRequest;

import java.util.List;
import java.util.Optional;

public interface IssueService {

    Optional<Issue> getIssueById(Long issueId) throws Exception;

    List<Issue> getIssueByProjectId(Long projectId) throws Exception;

    Issue createIssue(IssueRequest issue, Long userid) throws Exception;

    Optional<Issue> updateIssue(Long issueid,IssueRequest updatedIssue,Long userid ) throws Exception;

    String deleteIssue(Long issueId,Long userid) throws Exception;

    List<Issue> getIssuesByAssigneeId(Long assigneeId) throws Exception;

    List<Issue> searchIssues(String title, String status, String priority, Long assigneeId) throws Exception;

    List<User> getAssigneeForIssue(Long issueId) throws Exception;

    Issue addUserToIssue(Long issueId, Long userId) throws Exception;

    Issue updateStatus(Long issueId, String status) throws Exception;
}
