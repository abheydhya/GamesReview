package com.game.gamereview;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/games")
public class GamesController {
    @Autowired
    private GamesService gamesService;

    @GetMapping
    public ResponseEntity<List<Games>> getallGames() {
        return new ResponseEntity<List<Games>>(gamesService.allGames(), HttpStatus.OK);
    }

    @GetMapping("/{gameId}")
    public ResponseEntity<Optional<Games>> getSingleGame(@PathVariable String gameId){
    return new ResponseEntity<Optional<Games>>(gamesService.singleGames(gameId),HttpStatus.OK);
    }

}

