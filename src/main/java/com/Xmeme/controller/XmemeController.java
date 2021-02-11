package com.Xmeme.controller;

import java.util.List;

import com.Xmeme.entities.Memes;
import com.Xmeme.services.UserServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Component
@RequestMapping("memes")
public class XmemeController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public List<Memes> getMemes() throws JsonMappingException, JsonProcessingException {
        List<Memes> movies = userService.getMemes();
        return movies;
    }

    @PostMapping
    public ResponseEntity<String> postMemes(@RequestBody Memes userMeme) {
    	System.out.println("image_url is"+userMeme.getImageaddress());
    	System.out.println("image_url is"+userMeme.getName());
    	System.out.println("image_url is"+userMeme.getCaption());
    	//userMeme.setImage_url("1234sadfgr");
        return userService.postMemes(userMeme);
    }
   
}
