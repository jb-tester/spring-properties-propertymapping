package com.mytests.spring.springpropertiespropertmapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest(properties = {"spring.datasource.url=jdbc:h2:file:~/data/test1",
                           "spring.datasource.username=''",
                           "spring.datasource.password=''"})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DataJpaTestPropertiesTest {


    @Autowired
    private PersonRepository personRepository;

    @Test
    void testRepoExists() {
        assertNotNull(personRepository);

    }

    @Test
    void testCountRows() {
        long count = personRepository.count();
        System.out.println(count);
        assertEquals(8, count);
    }
}
