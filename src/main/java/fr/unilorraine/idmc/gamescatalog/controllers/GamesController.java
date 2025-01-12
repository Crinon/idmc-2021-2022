package fr.unilorraine.idmc.gamescatalog.controllers;

import fr.unilorraine.idmc.gamescatalog.entities.Game;
import fr.unilorraine.idmc.gamescatalog.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("games")
public class GamesController {
    @Autowired
    private final GameService gameService;
    @GetMapping
    public Iterable<Game> getAll(){
        return gameService.findAll();
    }
    @PostMapping
    public Game create(@RequestBody Game gg){
        return gameService.create(gg);
    }

}
