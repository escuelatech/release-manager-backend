package com.escuela.releasemanager.model;

public class ErrorModel {

    private String code;

    private String message;

    private ErrorModel(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static class Builder {

        private String code;

        private String message;

        public Builder withCode(String code) {
            this.code = code;
            return this;
        }

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public ErrorModel build() {
            return new ErrorModel(this);
        }

    }

    public static Builder builder() {
        return new Builder();
    }

}
