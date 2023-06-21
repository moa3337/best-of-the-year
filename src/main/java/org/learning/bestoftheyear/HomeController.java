package org.learning.bestoftheyear;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller // Dico a Spring che questo è un controller
public class HomeController {
    @GetMapping("/") // A quale rotta rispondono i metodi di questo controller
    public String home(Model model) {
        // Definisco il nome da visualizzare
        String name = "Mohamed";
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/songs")
    public String getBestSongs(Model model) {
        // Ottiengo lista delle migliori canzoni
        List<Song> songs = getBestSongs();
        /*List<String> songTitles = new ArrayList<>();
        for (Song song : songs) {
            songTitles.add(song.getTitle());
        }
        String addTitles = String.join(", ", songTitles);*/

        model.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/movies")
    public String getBestMovies(Model model) {
        // Ottiengo lista dei migliori film
        List<Movie> movies = getBestMovies();
        model.addAttribute("movies", movies);
        return "movies";
    }

    private List<Song> getBestSongs() {
        // Recupero canzoni da lista statica
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "They don't care about us"));
        songs.add(new Song(2, "Black or white"));
        songs.add(new Song(3, "Smooth criminal"));
        return songs;
    }

    public static class Song {
        private int id;
        private String title;

        public Song(int id, String title) {
            this.id = id;
            this.title = title;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }
    }

    private List<Movie> getBestMovies() {
        // Recupero canzoni da lista statica
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Robocop"));
        movies.add(new Movie(2, "Robocop 2"));
        movies.add(new Movie(3, "Robocop 3"));
        return movies;
    }

    public static class Movie {
        private int id;
        private String title;

        public Movie(int id, String title) {
            this.id = id;
            this.title = title;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }
    }
}


