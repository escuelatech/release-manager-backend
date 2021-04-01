package com.escuela.releasemanager.model;

import com.escuela.releasemanager.deserializer.JiraIssueDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(using = JiraIssueDeserializer.class)
public class IssueSearchModel {
    List<IssueModel> issues;

    public List<IssueModel> getIssues() {
        return issues;
    }

    public void setIssues(List<IssueModel> issues) {
        this.issues = issues;
    }
}
