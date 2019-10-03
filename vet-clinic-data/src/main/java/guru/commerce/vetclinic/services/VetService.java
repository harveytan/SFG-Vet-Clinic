package guru.commerce.vetclinic.services;

import guru.commerce.vetclinic.model.Vet;

import java.security.acl.Owner;
import java.util.Set;

public interface VetService {
    Vet findByLastName(String lastName);
    Vet findById(Long id);
    Set<Vet> findAll();
    Vet save(Vet vet);
}
