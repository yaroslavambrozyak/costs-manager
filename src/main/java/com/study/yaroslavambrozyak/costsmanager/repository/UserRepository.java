package com.study.yaroslavambrozyak.costsmanager.repository;

import com.study.yaroslavambrozyak.costsmanager.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {

    @Query("{name : ?0}")
    Optional<User> findUserByUserName(String userName);

}
