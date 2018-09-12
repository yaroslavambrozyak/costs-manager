package com.study.yaroslavambrozyak.costsmanager.service;

import com.study.yaroslavambrozyak.costsmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service("custom-user-details")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        return userRepository.findUserByEmail(userEmail)
                .map(user -> new User(
                        user.getEmail(),
                        user.getPassword(),
                        Collections.emptyList()))
                .orElseThrow(()->new UsernameNotFoundException("not found"));
    }
}
