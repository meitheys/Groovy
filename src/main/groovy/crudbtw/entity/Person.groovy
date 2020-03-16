package crudbtw.entity

import org.springframework.data.annotation.Id

import javax.persistence.*

@Entity
@Table(name = "person")
class Person {

    //Only this and it's done, groovy don't need those set and gets
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column
    long id
    @Column(name = "name")
    String name
    @Column(name = "age")
    int age
}
