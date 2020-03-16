package crudbtw.controllers

import crudbtw.entity.Person
import crudbtw.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "person")
class PersonController {

    @Autowired
    private final PersonService personService

    @RequestMapping
    List<Person> findAll() {
        trainerService.findAll()
    }


}
