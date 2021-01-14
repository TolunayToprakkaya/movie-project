package com.project.movie.controller;

import com.project.movie.base.dto.Cast;
import com.project.movie.service.ICastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cast")
public class CastController {

    @Autowired
    private ICastService castService;

    @GetMapping(value = "/fetchAllCastList", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Cast>> fetchAllCastList() {
        return new ResponseEntity<>(castService.fetchAllCastList(), HttpStatus.OK);
    }

    @GetMapping(value = "/inquireCastById/{castId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cast> inquireCastById(@PathVariable("castId") Long castId) {
        return new ResponseEntity<>(castService.inquireCastById(castId), HttpStatus.OK);
    }

    @PostMapping(value = "/createNewCast", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cast> createNewCast(@RequestBody Cast cast) {
        return new ResponseEntity<>(castService.createNewCast(cast), HttpStatus.OK);
    }

    @PutMapping(value = "/updateCast/{castId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cast> updateCast(@RequestBody Cast cast, @PathVariable("castId") Long castId) {
        return new ResponseEntity<>(castService.updateCast(cast, castId), HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteCastById/{castId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cast> deleteCastById(@PathVariable("castId") Long castId) {
        return new ResponseEntity<>(castService.deleteCastById(castId), HttpStatus.OK);
    }
}
