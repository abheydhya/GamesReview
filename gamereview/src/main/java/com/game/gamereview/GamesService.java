package com.game.gamereview;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamesService {
    @Autowired
    private GamesRepository gamesRepository;
    public List<Games> allGames(){
return gamesRepository.findAll();
    }


    public Optional<Games> singleGames(String gameId) {
        return gamesRepository.findGamesBygameId(gameId);
    }
}
