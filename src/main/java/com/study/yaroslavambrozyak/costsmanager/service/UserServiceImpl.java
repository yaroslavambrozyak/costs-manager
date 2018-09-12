package com.study.yaroslavambrozyak.costsmanager.service;

import com.study.yaroslavambrozyak.costsmanager.converter.UserConverter;
import com.study.yaroslavambrozyak.costsmanager.dto.user.UserRegistrationDTO;
import com.study.yaroslavambrozyak.costsmanager.entity.User;
import com.study.yaroslavambrozyak.costsmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {
        userRepository.findUserByEmail(userRegistrationDTO.getEmail())
                .ifPresent(user->{
                    throw new RuntimeException();
                });
        User user = userConverter.convertUserRegistrationDTOToUser(userRegistrationDTO);
        userRepository.save(user);
    }
}
