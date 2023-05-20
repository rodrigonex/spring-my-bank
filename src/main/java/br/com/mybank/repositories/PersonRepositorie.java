package br.com.mybank.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mybank.model.PersonModel;

@Repository
public interface PersonRepositorie extends CrudRepository<PersonModel, UUID> {

}
