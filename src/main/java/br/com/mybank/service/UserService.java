package br.com.mybank.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.mybank.model.PersonModel;
import br.com.mybank.model.UsersModel;
import br.com.mybank.repositories.UserRepositorie;

@Service
public class UserService {
    @Autowired
    private UserRepositorie userRepositorie;
    @Autowired
    private PersonService personService;

    public ResponseEntity<?> create(UsersModel user) {
        if (user.getEmail().equals("")) {
            return new ResponseEntity<>("Necessário informar o email.", HttpStatus.BAD_REQUEST);
        }

        if (user.getPassword().equals("")) {
            return new ResponseEntity<>("Necessário informar o password.", HttpStatus.BAD_REQUEST);
        }

        UsersModel userCreated = userRepositorie.save(user);

        if (userCreated.getEmail().length() > 0) {
            PersonModel person = new PersonModel();
            person.setEmail(userCreated.getEmail());
            person.setUserId(userCreated);

            personService.create(person);

            return new ResponseEntity<>(userCreated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(userCreated, HttpStatus.BAD_REQUEST);
        }
    }
    /*
     * 
     * public ResponseEntity<?> findAll() {
     * return new ResponseEntity<>(userRepositorie.findAll(), HttpStatus.OK);
     * }
     */
}
