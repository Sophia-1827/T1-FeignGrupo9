package com.cibertec.t1feigngrupo9.client;

import com.cibertec.t1feigngrupo9.dto.SwapiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "swapiClient", url = "${swapi.api.url:https://swapi.dev/api}")
public interface SwapiClient {

    @GetMapping("/people/")
    SwapiResponse getPeople();
}
