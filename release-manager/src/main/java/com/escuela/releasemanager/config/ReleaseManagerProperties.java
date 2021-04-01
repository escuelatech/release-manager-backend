package com.escuela.releasemanager.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class ReleaseManagerProperties {

    @Value("${release-manager.jira-api-user}")
    private  String jiraApiUser;

    @Value("${release-manager.jira-api-key}")
    private  String jiraApiKey;

    @Value("${release-manager.github-api-user}")
    private  String githubApiUser;

    @Value("${release-manager.github-api-key}")
    private  String githubApiKey;


    public ReleaseManagerProperties() {
    }

    public String getJiraApiUser() {
        return jiraApiUser;
    }

    public void setJiraApiUser(String jiraApiUser) {
        this.jiraApiUser = jiraApiUser;
    }

    public String getJiraApiKey() {
        return jiraApiKey;
    }


    public void setJiraApiKey(String jiraApiKey) {
        this.jiraApiKey = jiraApiKey;
    }

    public String getGithubApiUser() {
        return githubApiUser;
    }

    public void setGithubApiUser(String githubApiUser) {
        this.githubApiUser = githubApiUser;
    }

    public String getGithubApiKey() {
        return githubApiKey;
    }

    public void setGithubApiKey(String githubApiKey) {
        this.githubApiKey = githubApiKey;
    }
}
