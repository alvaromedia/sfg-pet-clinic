package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet entity) {
        super.delete(entity);
    }

    @Override
    public Vet save(Vet entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}