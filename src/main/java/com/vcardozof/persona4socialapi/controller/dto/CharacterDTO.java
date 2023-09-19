package com.vcardozof.persona4socialapi.controller.dto;

import com.vcardozof.persona4socialapi.model.Character;

public record CharacterDTO(Long id, String name, String arcana, int level, String description, String image, boolean isActive) {

    public static CharacterDTO fromEntity(Character character) {
        return new CharacterDTO(character.getId(), character.getName(), character.getArcana(), character.getLevel(), character.getDescription(), character.getImage(), character.isActive());
    }

    public Character toEntity() {
        return new Character(this.name, this.arcana, this.level, this.description, this.image, this.isActive);
    }

}
