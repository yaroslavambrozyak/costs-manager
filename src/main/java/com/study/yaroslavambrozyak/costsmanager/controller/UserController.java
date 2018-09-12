package com.study.yaroslavambrozyak.costsmanager.controller;

import com.study.yaroslavambrozyak.costsmanager.dto.user.UserRegistrationDTO;
import com.study.yaroslavambrozyak.costsmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/registration", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void registerUser(@RequestBody @Valid UserRegistrationDTO userRegistrationDTO) {
        System.out.println("inside" + userRegistrationDTO.getEmail());
        userService.registerUser(userRegistrationDTO);
    }

}
