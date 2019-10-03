package guru.commerce.vetclinic.model.guru.commer.vetclinic.services;

import guru.commerce.vetclinic.model.Pet;

import java.security.acl.Owner;
import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Set<Pet> findAll();
    Pet save(Pet pet);
}
