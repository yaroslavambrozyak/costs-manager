package com.study.yaroslavambrozyak.costsmanager.validation;

import com.study.yaroslavambrozyak.costsmanager.dto.user.UserRegistrationDTO;
import com.study.yaroslavambrozyak.costsmanager.validation.anotation.PasswordMatches;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        UserRegistrationDTO userRegistrationDTO = (UserRegistrationDTO) o;
        return userRegistrationDTO.getPassword().equals(userRegistrationDTO.getConfirmPassword());
    }
}
