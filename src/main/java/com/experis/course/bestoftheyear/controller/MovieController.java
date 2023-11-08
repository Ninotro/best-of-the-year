package com.experis.course.bestoftheyear.controller;

import com.experis.course.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String movies(Model model) {
        model.addAttribute("lista", getBestMovies());
        return "movies";
    }

    @GetMapping("/{id}")
    public String movieDetail(@PathVariable("id") int movieId, Model model) {

        Movie movie = getMovieById(movieId);
        model.addAttribute("movie", movie);
        return "movie-detail";
    }


    //    metodo private
    private List<Movie> getBestMovies() {
        Movie[] movieList = {new Movie("Il Padrino"), new Movie("interstellar"), new Movie("Spiderman"), new Movie("Il gladiatore")};

        return Arrays.asList(movieList);
    }

    private Movie getMovieById(int id) {
        for (Movie movie : getBestMovies()) {
            if (movie.getId() == id) {

                return movie;
            }

        }
        return null;

    }
    }











