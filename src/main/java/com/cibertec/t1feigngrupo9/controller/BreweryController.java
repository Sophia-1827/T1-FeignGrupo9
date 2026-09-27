package com.cibertec.t1feigngrupo9.controller;


import com.cibertec.t1feigngrupo9.dto.BreweryData;
import com.cibertec.t1feigngrupo9.service.BreweryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/breweries")
public class BreweryController {
    private final BreweryService service;

    @GetMapping("/micro-california")
    public List<BreweryData> getMicroBreweriesInCalifornia() {
        return service.getMicroBreweriesInCalifornia();
    }
}
