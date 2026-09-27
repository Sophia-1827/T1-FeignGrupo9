package com.cibertec.t1feigngrupo9.service;

import com.cibertec.t1feigngrupo9.client.SwapiClient;
import com.cibertec.t1feigngrupo9.dto.StarWarsCharacter;
import com.cibertec.t1feigngrupo9.dto.SwapiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StarWarsService {
    private static final String FEMALE_GENDER = "female";
    private static final int MIN_HEIGHT = 160;

    private final SwapiClient client;

    public List<StarWarsCharacter> getFemaleCharactersTallerThan160() {
        SwapiResponse response = client.getPeople();
        if (response == null || response.results() == null) {
            return List.of();
        }
        return response.results().stream()
                .filter(character -> FEMALE_GENDER.equalsIgnoreCase(character.gender()))
                .filter(character -> isTallerThanMinimum(character.height()))
                .toList();
    }

    private boolean isTallerThanMinimum(String height) {
        try {
            return Integer.parseInt(height) > MIN_HEIGHT;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
