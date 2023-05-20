package br.com.mybank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mybank.model.UsersModel;
//import br.com.mybank.service.PersonService;
import br.com.mybank.service.UserService;

@RestController
public class Controller {
    @Autowired
    private UserService userService;

    // @Autowired
    // private PersonService personService;

    @GetMapping("/")
    public String initialize() {
        return "Initialize application";
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody UsersModel user) {
        return userService.create(user);
    }

    /*
     * @GetMapping("/users")
     * public ResponseEntity<?> findUsersAll() {
     * return userService.findAll();
     * }
     * 
     * @GetMapping("/person")
     * public ResponseEntity<?> findPersonAll() {
     * return personService.findAll();
     * }
     */
}
