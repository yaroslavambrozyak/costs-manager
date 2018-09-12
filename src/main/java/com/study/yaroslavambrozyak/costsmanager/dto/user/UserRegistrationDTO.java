package com.study.yaroslavambrozyak.costsmanager.dto.user;

import com.study.yaroslavambrozyak.costsmanager.validation.anotation.PasswordMatches;
import com.study.yaroslavambrozyak.costsmanager.validation.anotation.ValidEmail;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@PasswordMatches
public class UserRegistrationDTO {

    @NotNull
    @NotEmpty
    @ValidEmail
    private String email;

    @NotNull
    @NotEmpty
    private String login;

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String confirmPassword;
}
