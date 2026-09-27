package com.cibertec.t1feigngrupo9.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SwapiResponse(Integer count,
                            String next,
                            String previous,
                            List<StarWarsCharacter> results) {
}
