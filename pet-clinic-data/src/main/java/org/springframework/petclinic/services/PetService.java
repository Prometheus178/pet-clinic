package org.springframework.petclinic.services;


import org.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
