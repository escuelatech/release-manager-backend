package com.escuela.releasemanager.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = RepositoryModel.Builder.class)
public class RepositoryModel {

    private String id;
    private String name;
    private String fullName;
    private String url;

    public RepositoryModel(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.fullName = builder.fullName;
        this.url=builder.url;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUrl() {
        return url;
    }

    static class Builder {

        private String id;
        private String name;
        @JsonProperty("full_name")
        private String fullName;
        private String url;

        public Builder withId(String repoId) {
            this.id = repoId;
            return this;
        }

        public Builder withName(String repoName) {
            this.name = repoName;
            return this;
        }

        public Builder withFullName(String repoFullName) {
            this.fullName = repoFullName;
            return this;
        }

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public RepositoryModel build() {
            return new RepositoryModel(this);
        }

    }

    public static RepositoryModel.Builder builder() {
        return new RepositoryModel.Builder();
    }
}
