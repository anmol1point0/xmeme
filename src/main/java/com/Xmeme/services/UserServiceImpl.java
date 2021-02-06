package com.Xmeme.services;

import java.util.List;

import com.Xmeme.entities.Memes;
import com.Xmeme.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public List<Memes> getMemes() {
        List<Memes> memes = userRepository.findAll();
        return memes;
    }

    public ResponseEntity<String> postMemes(Memes userMeme) {
        if (userMeme != null) {
            userRepository.save(userMeme);
            return ResponseEntity.ok().body("Saved in the DB");
        } else {
            return ResponseEntity.badRequest().body("Meme is null");
        }
    }

}
