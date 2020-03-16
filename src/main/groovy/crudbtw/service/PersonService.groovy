package crudbtw.service

import crudbtw.entity.Person

interface PersonService {
    List<Person> findAll()
}