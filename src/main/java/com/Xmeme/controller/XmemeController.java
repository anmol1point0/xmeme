package com.Xmeme.controller;

import java.util.List;

import com.Xmeme.entities.Memes;
import com.Xmeme.services.UserServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class XmemeController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/getMemes")
    public List<Memes> getMemes() throws JsonMappingException, JsonProcessingException {
        List<Memes> movies = userService.getMemes();
        return movies;
    }

    @PostMapping(value = "/postMemes")
    public ResponseEntity<String> postMemes(@RequestBody Memes userMeme) {

        return userService.postMemes(userMeme);
    }

}
