package com.project.movie.controller;

import com.project.movie.base.dto.Actress;
import com.project.movie.service.IActressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actress")
public class ActressController {

    @Autowired
    private IActressService actressService;

    @GetMapping(value = "/fetchAllActressList", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Actress>> fetchAllActressList() {
        return new ResponseEntity<>(actressService.fetchAllActressList(), HttpStatus.OK);
    }

    @GetMapping(value = "/inquireActressById/{actressId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actress> inquireActressById(@PathVariable("actressId") Long actressId) {
        return new ResponseEntity<>(actressService.inquireActressById(actressId), HttpStatus.OK);
    }

    @PostMapping(value = "/createNewActress", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actress> createNewActress(@RequestBody Actress actress) {
        return new ResponseEntity<>(actressService.createNewActress(actress), HttpStatus.OK);
    }

    @PutMapping(value = "/updateActress/{actressId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actress> updateActress(@RequestBody Actress actress, @PathVariable("actressId") Long actressId) {
        return new ResponseEntity<>(actressService.updateActress(actress, actressId), HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteActressById/{actressId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actress> deleteActressById(@PathVariable("actressId") Long actressId) {
        return new ResponseEntity<>(actressService.deleteActressById(actressId), HttpStatus.OK);
    }
}
