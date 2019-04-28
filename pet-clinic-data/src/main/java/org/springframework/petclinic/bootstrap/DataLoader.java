package org.springframework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.petclinic.model.Owner;
import org.springframework.petclinic.model.Vet;
import org.springframework.petclinic.services.OwnerService;
import org.springframework.petclinic.services.VetService;
import org.springframework.petclinic.services.map.OwnerServiceMap;
import org.springframework.petclinic.services.map.VetServiceMap;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private OwnerService ownerService;
    private VetService vetService;


    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstname("Mike");
        owner1.setLastname("Bolton");

        ownerService.save(owner1);

        System.out.println("load owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstname("Sara");
        vet1.setLastname("Connor");
        vetService.save(vet1);
        System.out.println("load vets....");
    }
}
