package com.escuela.releasemanager.model;

import java.util.Objects;

public class IssueModel {
    private String projectKey;
    private String issueKey;
    private String issueType;
    private String issueSummary;

    public String getProjectKey() {
        return projectKey;
    }

    public String getIssueKey() {
        return issueKey;
    }

    public String getIssueType() {
        return issueType;
    }

    public String getIssueSummary() {
        return issueSummary;
    }

    public IssueModel(Builder builder) {
        this.projectKey = builder.projectKey;
        this.issueKey = builder.issueKey;
        this.issueType = builder.issueType;
        this.issueSummary = builder.issueSummary;
    }

    public static class Builder {

        private String projectKey;
        private String issueKey;
        private String issueType;
        private String issueSummary;


        public Builder withProjectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder withIssueKey(String issueKey) {
            this.issueKey = issueKey;
            return this;
        }

        public Builder withIssueType(String issueType) {
            this.issueType = issueType;
            return this;
        }

        public Builder withIssueSummary(String issueSummary) {
            this.issueSummary = issueSummary;
            return this;
        }

        public IssueModel build() {
            return new IssueModel(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(projectKey, builder.projectKey) &&
                    Objects.equals(issueKey, builder.issueKey) &&
                    Objects.equals(issueType, builder.issueType) &&
                    Objects.equals(issueSummary, builder.issueSummary);
        }

        @Override
        public int hashCode() {
            return Objects.hash(projectKey, issueKey, issueType, issueSummary);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
