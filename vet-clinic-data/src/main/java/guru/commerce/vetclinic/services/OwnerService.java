package guru.commerce.vetclinic.services;

import java.util.Set;
import guru.commerce.vetclinic.model.Owner;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Set<Owner> findAll();
    Owner save(Owner owner);
}
