package com.experis.course.bestoftheyear.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {


    @GetMapping("home")
    public String home(Model model ) {
        model.addAttribute("name","Nino");
        return "home";
    }

    @GetMapping("movies")
    public String movies (Model model) {
        model.addAttribute("lista",getBestMovies());

        return "movies";


    }

    @GetMapping("songs")
    public String songs (Model model) {
        model.addAttribute("lista",getBestSongs());

        return "songs";


    }

    public String getBestMovies() {
        List<String>  movies = new ArrayList <>();
        Collections.addAll(movies, "il Padrino","StarWars","Kill Bill","Interstellar");
        String stringaMovie = "";
        for (String movie : movies) {
            stringaMovie += movie + ",";
        }

        return stringaMovie;
    }

    public String getBestSongs() {
        List<String>  songs = new ArrayList <>();
        Collections.addAll( songs, "Don't stop me now","Imagine","One Piece Theme song","Soundtrack Interstellar");
        String stringaSong = "";
        for (String  song :  songs) {
            stringaSong += song + ",";
        }

        return stringaSong;
    }

}
