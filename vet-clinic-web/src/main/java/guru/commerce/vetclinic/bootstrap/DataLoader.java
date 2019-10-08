package guru.commerce.vetclinic.bootstrap;

import guru.commerce.vetclinic.model.Owner;
import guru.commerce.vetclinic.model.Vet;
import guru.commerce.vetclinic.services.OwnerService;
import guru.commerce.vetclinic.services.VetService;
import guru.commerce.vetclinic.services.map.OwnerServiceMap;
import guru.commerce.vetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    private OwnerService ownerService;
    private final VetService vetService;
    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setAddress("address1");
        owner.setFirstName("John");
        owner.setLastName("Doe");
        ownerService.save(owner);
        System.out.println(owner);

        owner = new Owner();
        owner.setId(2L);
        owner.setAddress("address 2");
        owner.setFirstName("Jane");
        owner.setLastName("Doe");
        ownerService.save(owner);
        System.out.println(owner);


        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("DR. OP");
        vet.setLastName("KIQ");
        vetService.save(vet);
        System.out.println(vet);

        vet = new Vet();
        vet.setId(2L);
        vet.setFirstName("DR. Q");
        vet.setLastName("Polk");
        vetService.save(vet);
        System.out.println(vet);

    }
}
