package com.study.yaroslavambrozyak.costsmanager.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class User {

    @Id
    private String id;
    private String name;
    private String password;

}
