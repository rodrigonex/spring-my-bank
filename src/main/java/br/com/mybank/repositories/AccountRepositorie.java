package br.com.mybank.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mybank.model.AccountModel;

@Repository
public interface AccountRepositorie extends CrudRepository<AccountModel, UUID> {

}
