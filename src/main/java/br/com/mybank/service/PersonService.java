package br.com.mybank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.mybank.model.PersonModel;
import br.com.mybank.repositories.PersonRepositorie;

@Service
public class PersonService {
    @Autowired
    private PersonRepositorie personRepositorie;

    public ResponseEntity<?> create(PersonModel person) {
        if (person.getEmail().equals("")) {
            return new ResponseEntity<>("Necessário informar o email", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(personRepositorie.save(person), HttpStatus.CREATED);
        }
    }
    /*
     * public ResponseEntity<?> findAll() {
     * return new ResponseEntity<>(personRepositorie.findAll(), HttpStatus.OK);
     * }
     */
}
