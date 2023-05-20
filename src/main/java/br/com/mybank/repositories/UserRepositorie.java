package br.com.mybank.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mybank.model.UsersModel;

@Repository
public interface UserRepositorie extends CrudRepository<UsersModel, UUID> {

}
