package com.Xmeme.repositories;

import com.Xmeme.entities.Memes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Memes, String> {

}
