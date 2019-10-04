package guru.commerce.vetclinic.services;

import java.util.Set;
import guru.commerce.vetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
