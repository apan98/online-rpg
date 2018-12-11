package com.template.validation;

import com.template.dao.jpa.UsersRepository;
import com.template.domain.model.User;
import com.template.exception.EntityValidationException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.SmartValidator;

import java.util.Arrays;

@Service
@Slf4j
@AllArgsConstructor
public class UserValidation implements SmartValidator {

    private UsersRepository usersRepository;

    @Override
    public void validate(Object target, Errors errors, Object... validationHints) {

        if (target instanceof User) {
            User user = (User) target;
            String methodName = (String) Arrays.asList(validationHints).get(0);
            if (methodName.equals(Code.UPDATE.name())) {
                this.update(user, errors);
            }
            if (methodName.equals(Code.CREATE.name())) {
                this.create(user, errors);
            }

        } else {
            errors.reject("object must be a user");
        }


        if (errors.hasErrors()) {
            throw new EntityValidationException(errors);
        }
    }

    void update(User user, Errors errors) {
        if (user.getId() == null) {
            errors.rejectValue("id", "id must not be null");
        }
        else if (user.getPassword() != null){
            errors.rejectValue("password", "cannot change password");
        }
    }


    void create(User user, Errors errors) {
        if (user.getId() != null) {
            errors.rejectValue("id", "id must be null");
        }
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(User.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        validate(target, errors, null);
    }

    public enum Code {
        UPDATE,
        CREATE
    }

}