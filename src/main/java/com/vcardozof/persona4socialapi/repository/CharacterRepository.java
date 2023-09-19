package com.vcardozof.persona4socialapi.repository;

import com.vcardozof.persona4socialapi.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
}
