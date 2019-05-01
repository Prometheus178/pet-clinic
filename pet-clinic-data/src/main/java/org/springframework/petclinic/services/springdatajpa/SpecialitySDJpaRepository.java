package org.springframework.petclinic.services.springdatajpa;


import org.springframework.context.annotation.Profile;
import org.springframework.petclinic.model.Speciality;
import org.springframework.petclinic.repositories.SpecialityRepository;
import org.springframework.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaRepository implements SpecialtyService {

    private final SpecialityRepository specialityRepository;


    public SpecialitySDJpaRepository(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
