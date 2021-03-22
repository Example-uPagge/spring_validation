package org.sadtech.example.springvalidation.repository;

import org.sadtech.example.springvalidation.dto.PersonDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonDto, Long> {

}
