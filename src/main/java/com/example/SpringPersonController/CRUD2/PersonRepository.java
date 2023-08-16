package com.example.SpringPersonController.CRUD2;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository <Person, Long> {
}
