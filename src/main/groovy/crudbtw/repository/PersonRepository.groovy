package crudbtw.repository

import crudbtw.entity.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAll()
}
