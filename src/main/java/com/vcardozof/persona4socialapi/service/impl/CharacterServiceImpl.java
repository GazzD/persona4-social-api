package com.vcardozof.persona4socialapi.service.impl;

import com.vcardozof.persona4socialapi.controller.dto.CharacterDTO;
import com.vcardozof.persona4socialapi.repository.CharacterRepository;
import com.vcardozof.persona4socialapi.service.interfaces.CharacterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    public final CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<CharacterDTO> getAllCharacters() {
        return characterRepository.findAll().stream().map(CharacterDTO::fromEntity).toList();
    }

    public CharacterDTO createCharacter(CharacterDTO characterDTO) {
        return CharacterDTO.fromEntity(characterRepository.save(characterDTO.toEntity()));
    }
}
