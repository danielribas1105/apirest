package drcode.apirest.controller;

import drcode.apirest.model.Person;
import drcode.apirest.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String helloWorld(){
        return ("This is my first API Rest em Spring Boot!");
    }

    //Métodos das requisições
    @GetMapping("/person")
    public List<Person> getAll(){
        return repository.findAll();
    }

    @GetMapping("person/{id}")
    public Optional<Person> getById(@PathVariable Long id){
        return repository.findById(id);
    }
}
