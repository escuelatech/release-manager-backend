package com.escuela.releasemanager.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder=ProjectModel.Builder.class)
public class ProjectModel {
    private String id;
    private String name;
    private String key;
    

    public ProjectModel(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.key = builder.key;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    static class Builder {

        private String id;
        private String name;
        private String key;

        public Builder withId(String projectId) {
            this.id = projectId;
            return this;
        }

        public Builder withName(String projectName) {
            this.name = projectName;
            return this;
        }

        public Builder withKey(String projectKey) {
            this.key = projectKey;
            return this;
        }

        public ProjectModel build() {
            return new ProjectModel(this);
        }

    }

    public static Builder builder() {
        return new Builder();
    }
}
