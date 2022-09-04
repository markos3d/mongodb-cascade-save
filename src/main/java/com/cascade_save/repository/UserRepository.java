package com.cascade_save.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cascade_save.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
