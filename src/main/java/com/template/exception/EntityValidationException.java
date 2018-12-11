package com.template.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.stream.Collectors;

@ResponseStatus(
        value = HttpStatus.BAD_REQUEST,
        code = HttpStatus.BAD_REQUEST)  // 400
public class EntityValidationException extends IllegalArgumentException {

    public EntityValidationException(Errors errors) {
        super("validation not passed: ".concat(errors.getAllErrors().stream().map(x -> x.getCodes()[3]).collect(Collectors.joining("\n"))));
    }

}