package br.com.mybank.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mybank.model.HistoryMovimentModel;

@Repository
public interface HistoryMovimentRepositorie extends CrudRepository<HistoryMovimentModel, UUID> {

}
