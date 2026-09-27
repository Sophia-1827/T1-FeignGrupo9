package com.cibertec.t1feigngrupo9.service;

import com.cibertec.t1feigngrupo9.client.BreweryClient;
import com.cibertec.t1feigngrupo9.dto.BreweryData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BreweryService {
    private static final String MICRO_TYPE = "micro";
    private static final String CALIFORNIA_STATE = "California";
    private static final int PAGE_SIZE = 200;

    private final BreweryClient client;

    public List<BreweryData> getMicroBreweriesInCalifornia() {
        List<BreweryData> result = new ArrayList<>();
        int page = 1;
        List<BreweryData> batch;
        do {
            // correccion, la API devuelve maximo 200 registros por pagina (California tiene 466 micro),
            // por eso se pagina hasta recibir una pagina incompleta
            batch = client.getBreweries(MICRO_TYPE, CALIFORNIA_STATE, PAGE_SIZE, page++);
            batch.stream()
                    .filter(b -> MICRO_TYPE.equals(b.getBrewery_type()))
                    .filter(b -> CALIFORNIA_STATE.equals(b.getState()))
                    .forEach(result::add);
        } while (batch.size() == PAGE_SIZE);
        return result;
    }
}