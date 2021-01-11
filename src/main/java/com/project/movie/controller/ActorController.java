package com.project.movie.controller;

import com.project.movie.base.dto.Actor;
import com.project.movie.service.IActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private IActorService actorService;

    @GetMapping(value = "/fetchAllActorList", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Actor>> fetchAllActorList() {
        return new ResponseEntity<>(actorService.fetchAllActorList(), HttpStatus.OK);
    }

    @GetMapping(value = "/inquireActorById/{actorId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actor> inquireActorById(@PathVariable("actorId") Long actorId) {
        return new ResponseEntity<>(actorService.inquireActorById(actorId), HttpStatus.OK);
    }

    @PostMapping(value = "/createNewActor", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actor> createNewActor(@RequestBody Actor actor) {
        return new ResponseEntity<>(actorService.createNewActor(actor), HttpStatus.OK);
    }

    @PutMapping(value = "/updateActor/{actorId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actor> updateActor(@RequestBody Actor actor, @PathVariable("actorId") Long actorId) {
        return new ResponseEntity<>(actorService.updateActor(actor, actorId), HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteActorById/{actorId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actor> deleteActorById(@PathVariable("actorId") Long actorId) {
        return new ResponseEntity<>(actorService.deleteActorById(actorId), HttpStatus.OK);
    }
}
