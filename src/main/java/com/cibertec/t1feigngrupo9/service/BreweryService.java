package com.cibertec.t1feigngrupo9.service;


import com.cibertec.t1feigngrupo9.client.BreweryClient;
import com.cibertec.t1feigngrupo9.dto.BreweryData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BreweryService {

    private final BreweryClient client;

    public List<BreweryData> getMicroBreweriesInCalifornia() {
        List<BreweryData> breweries = client.getBreweries();

        return breweries.stream()
                .filter(b -> "micro".equals(b.getBrewery_type()))
                .filter(b -> "California".equals(b.getState()))
                .collect(Collectors.toList());
    }
}
