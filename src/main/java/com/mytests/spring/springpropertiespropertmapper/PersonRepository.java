package com.mytests.spring.springpropertiespropertmapper;

import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, Long> {
}
