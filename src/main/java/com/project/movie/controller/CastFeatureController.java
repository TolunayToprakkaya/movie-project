package com.project.movie.controller;

import com.project.movie.base.dto.CastFeature;
import com.project.movie.service.ICastFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cast/feature")
public class CastFeatureController {

    @Autowired
    private ICastFeatureService castFeatureService;

    @GetMapping(value = "/fetchAllCastFeatureList", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CastFeature>> fetchAllCastFeatureList() {
        return new ResponseEntity<>(castFeatureService.fetchAllCastFeatureList(), HttpStatus.OK);
    }

    @GetMapping(value = "/inquireCastFeatureById/{castFeatureId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CastFeature> inquireCastFeatureById(@PathVariable("castFeatureId") Long castFeatureId) {
        return new ResponseEntity<>(castFeatureService.inquireCastFeatureById(castFeatureId), HttpStatus.OK);
    }

    @PostMapping(value = "/createNewCastFeature", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CastFeature> createNewCastFeature(@RequestBody CastFeature castFeature) {
        return new ResponseEntity<>(castFeatureService.createNewCastFeature(castFeature), HttpStatus.OK);
    }

    @PutMapping(value = "/updateCastFeature/{castFeatureId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CastFeature> updateCastFeature(@RequestBody CastFeature castFeature, @PathVariable("castFeatureId") Long castFeatureId) {
        return new ResponseEntity<>(castFeatureService.updateCastFeature(castFeature, castFeatureId), HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteCastFeatureById/{castFeatureId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CastFeature> deleteCastFeatureById(@PathVariable("castFeatureId") Long castFeatureId) {
        return new ResponseEntity<>(castFeatureService.deleteCastFeatureById(castFeatureId), HttpStatus.OK);
    }
}
