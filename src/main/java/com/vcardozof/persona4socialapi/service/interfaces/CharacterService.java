package com.vcardozof.persona4socialapi.service.interfaces;

import com.vcardozof.persona4socialapi.controller.dto.CharacterDTO;

import java.util.List;

public interface CharacterService {
    List<CharacterDTO> getAllCharacters();
    CharacterDTO createCharacter(CharacterDTO characterDTO);

}
