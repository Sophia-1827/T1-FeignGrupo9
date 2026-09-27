package com.cibertec.t1feigngrupo9.controller;


import com.cibertec.t1feigngrupo9.dto.BreweryData;
import com.cibertec.t1feigngrupo9.service.BreweryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BreweryController {
    private final BreweryService service;

    public BreweryController(BreweryService service) {
        this.service = service;
    }

    @GetMapping("/api/breweries/micro-california")
    public List<BreweryData> getMicroBreweriesInCalifornia() {
        return service.getMicroBreweriesInCalifornia();
    }
}
