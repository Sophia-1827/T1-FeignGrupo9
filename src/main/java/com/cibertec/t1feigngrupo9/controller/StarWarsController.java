package com.cibertec.t1feigngrupo9.controller;

import com.cibertec.t1feigngrupo9.dto.StarWarsCharacter;
import com.cibertec.t1feigngrupo9.service.StarWarsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/starwars")
public class StarWarsController {
    private final StarWarsService service;

    @GetMapping("/females-over-160")
    public List<StarWarsCharacter> getFemaleCharactersTallerThan160() {
        return service.getFemaleCharactersTallerThan160();
    }
}
