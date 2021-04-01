package com.escuela.releasemanager.exceptions;

import com.escuela.releasemanager.model.ErrorModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class RestExceptionHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(JiraResponseDeserializingException.class)
    public ResponseEntity<ErrorModel> handleDeserializationError(JiraResponseDeserializingException ex) {
        LOGGER.info("Deserialization Error:", ex);
        ErrorModel error = ErrorModel.builder()
                .withCode("ER-501")
                .withMessage(ex.getMessage())
                .build();

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
