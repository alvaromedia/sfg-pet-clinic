package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Profile("springdatajpa")
public class PetTypeSpringDataJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    @Autowired
    public PetTypeSpringDataJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Set<PetType> findAll() {

//        Set<PetType> petTypes =
//                StreamSupport.stream(petTypeRepository.findAll().spliterator(), false)
//                .collect(Collectors.toSet());

        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);

        return petTypes;

    }

    @Override
    public PetType findById(Long aLong) {

        Optional<PetType> optionalPetType = petTypeRepository.findById(aLong);
        return optionalPetType.orElse(null);

    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
