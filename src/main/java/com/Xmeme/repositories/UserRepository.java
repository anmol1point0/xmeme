package com.Xmeme.repositories;

import com.Xmeme.entities.Memes;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Memes, String> {
	public Memes findMemeById(String id);

}
