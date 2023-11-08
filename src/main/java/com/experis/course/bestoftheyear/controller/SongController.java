package com.experis.course.bestoftheyear.controller;

import com.experis.course.bestoftheyear.model.Movie;
import com.experis.course.bestoftheyear.model.Song;
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
@RequestMapping("songs")
public class SongController {

    @GetMapping
    public String songs (Model model) {
        model.addAttribute("lista",getBestSongs());

        return "songs";


    }

    @GetMapping("/{id}")
    public String SongDetail(@PathVariable("id") int songId, Model model) {

        Song song = getSongById(songId);
        model.addAttribute("song", song);
        return "song-detail";
    }


    private List<Song> getBestSongs() {
        Song []  songList = {new Song("Don't stop me now"), new Song("Imagine"),new Song("One Piece Theme song"),new Song("The dwarfs")};

        return Arrays.asList(songList);
    }

    private Song getSongById(int id) {
        for (Song song : getBestSongs()) {
            if (song.getId() == id) {

                return song;
            }

        }
        return null;

    }
}
