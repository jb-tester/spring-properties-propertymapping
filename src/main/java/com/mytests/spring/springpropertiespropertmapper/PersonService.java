package com.mytests.spring.springpropertiespropertmapper;

import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 2/6/2025.</p>
 * *
 */
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void getAllPersons() {
        System.out.println("====== all =====");
        personRepository.findAll().forEach(System.out::println);
        System.out.println("===================");
    }

    ;
}
