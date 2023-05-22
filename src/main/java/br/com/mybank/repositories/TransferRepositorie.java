package br.com.mybank.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepositorie extends CrudRepository<TransferRepositorie, UUID> {

}
