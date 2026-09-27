package com.cibertec.t1feigngrupo9.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record StarWarsCharacter(String name, String height, String gender) {
}
