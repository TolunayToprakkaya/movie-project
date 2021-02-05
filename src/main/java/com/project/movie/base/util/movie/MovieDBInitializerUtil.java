package com.project.movie.base.util.movie;

import com.project.movie.entity.MovieEntity;
import com.project.movie.repository.MovieRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class MovieDBInitializerUtil {

    private MovieRepository movieRepository;

    @PostConstruct
    private void initDb() {
        /*
        if (movieRepository.count() <= 0) {
            createMovies();
        }
         */
    }

    private void createMovies() {
        MovieEntity movieEntity1 = MovieEntity.builder()
                .name("The Godfather")
                .title("Crime, Drama")
                .cover("https://i.etsystatic.com/9801454/r/il/a17b36/1196585338/il_570xN.1196585338_a6ec.jpg")
                .build();

        MovieEntity movieEntity2 = MovieEntity.builder()
                .name("Fight Club")
                .title("Drama")
                .cover("https://images-na.ssl-images-amazon.com/images/I/713OBFnCXjL._AC_SL1414_.jpg")
                .build();

        MovieEntity movieEntity3 = MovieEntity.builder()
                .name("Léon")
                .title("Action, Crime, Drama")
                .cover("https://images-na.ssl-images-amazon.com/images/I/51UM55UvWXL._AC_.jpg")
                .build();

        movieRepository.saveAll(Arrays.asList(movieEntity1, movieEntity2, movieEntity3));
    }
}
