package com.study.yaroslavambrozyak.costsmanager.converter;

import com.study.yaroslavambrozyak.costsmanager.dto.user.UserRegistrationDTO;
import com.study.yaroslavambrozyak.costsmanager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User convertUserRegistrationDTOToUser(UserRegistrationDTO userRegistrationDTO){
        User user = new User();
        user.setEmail(userRegistrationDTO.getEmail());
        user.setLogin(userRegistrationDTO.getLogin());
        user.setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()));
        return user;
    }

}
