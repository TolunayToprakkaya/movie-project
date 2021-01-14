package com.project.movie.controller;

import com.project.movie.base.dto.CreateNewMovieRequest;
import com.project.movie.base.dto.Movie;
import com.project.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @GetMapping(value = "/fetchAllMovieList", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Movie>> fetchAllMovieList() {
        return new ResponseEntity<>(movieService.fetchAllMovieList(), HttpStatus.OK);
    }

    @GetMapping(value = "/inquireMovieById/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> inquireMovieById(@PathVariable("movieId") Long movieId) {
        return new ResponseEntity<>(movieService.inquireMovieById(movieId), HttpStatus.OK);
    }

    @PostMapping(value = "/createNewMovie", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> createNewMovie(@RequestBody CreateNewMovieRequest request) {
        return new ResponseEntity<>(movieService.createNewMovie(request), HttpStatus.OK);
    }

    @PutMapping(value = "/updateMovie/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable("movieId") Long movieId) {
        return new ResponseEntity<>(movieService.updateMovie(movie, movieId), HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteMovieById/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> deleteMovieById(@PathVariable("movieId") Long movieId) {
        return new ResponseEntity<>(movieService.deleteMovieById(movieId), HttpStatus.OK);
    }
}
