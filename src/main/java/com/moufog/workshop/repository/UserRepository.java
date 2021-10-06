package com.moufog.workshop.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moufog.workshop.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{


}
