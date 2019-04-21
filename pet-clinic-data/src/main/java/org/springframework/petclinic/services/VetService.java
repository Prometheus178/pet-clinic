package org.springframework.petclinic.services;

import org.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByID(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
