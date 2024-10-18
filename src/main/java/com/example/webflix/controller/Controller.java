package com.example.webflix.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/movies")
    public String movies(){
        return "movies";
    }

    @GetMapping("/recently-added")
    public String recentlyAdded(){
        return "recently-added";
    }

    @GetMapping("/tv-shows")
    public String tvShows(){
        return "tv-shows";
    }

    @GetMapping("/search")
    public String search(){
        return "search";
    }




}
