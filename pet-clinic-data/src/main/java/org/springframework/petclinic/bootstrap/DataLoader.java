package org.springframework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.petclinic.model.Owner;
import org.springframework.petclinic.model.PetType;
import org.springframework.petclinic.model.Vet;
import org.springframework.petclinic.services.OwnerService;
import org.springframework.petclinic.services.PetTypeService;
import org.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;

    }




    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType saveDogType = petTypeService.save(dog);
        Owner owner1 = new Owner();

        owner1.setFirstname("Mike");
        owner1.setLastname("Bolton");

        ownerService.save(owner1);

        System.out.println("load owners....");

        Vet vet1 = new Vet();

        vet1.setFirstname("Sara");
        vet1.setLastname("Connor");
        vetService.save(vet1);
        System.out.println("load vets....");
    }
}
