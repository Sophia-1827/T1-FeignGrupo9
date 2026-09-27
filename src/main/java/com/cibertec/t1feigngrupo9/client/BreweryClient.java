package com.cibertec.t1feigngrupo9.client;

import com.cibertec.t1feigngrupo9.dto.BreweryData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "breweryClient", url = "https://api.openbrewerydb.org/v1")
public interface BreweryClient {
    @GetMapping("/breweries")
    List<BreweryData> getBreweries(@RequestParam("by_type") String type,
                                   @RequestParam("by_state") String state,
                                   @RequestParam("per_page") int perPage,
                                   @RequestParam("page") int page);
}