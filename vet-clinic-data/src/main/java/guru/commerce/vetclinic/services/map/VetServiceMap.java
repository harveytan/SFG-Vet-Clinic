package guru.commerce.vetclinic.services.map;

import guru.commerce.vetclinic.model.Owner;
import guru.commerce.vetclinic.model.Vet;
import guru.commerce.vetclinic.services.OwnerService;
import guru.commerce.vetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
