package com.vcardozof.persona4socialapi.controller.impl;

import com.vcardozof.persona4socialapi.controller.dto.CharacterDTO;
import com.vcardozof.persona4socialapi.controller.interfaces.CharacterController;
import com.vcardozof.persona4socialapi.service.interfaces.CharacterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/characters")
public class CharacterControllerImpl implements CharacterController {

    private final CharacterService characterService;

    public CharacterControllerImpl(CharacterService characterService) {
        this.characterService = characterService;
    }
    @GetMapping("")
    public List<CharacterDTO> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @PostMapping("")
    public CharacterDTO createCharacter(@RequestBody CharacterDTO characterDTO) {
        return characterService.createCharacter(characterDTO);
    }
}
