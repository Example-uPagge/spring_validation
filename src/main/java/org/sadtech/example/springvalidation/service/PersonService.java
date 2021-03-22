package org.sadtech.example.springvalidation.service;

import org.sadtech.example.springvalidation.dto.PersonDto;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
@Validated
public class PersonService {

    public void save(@Valid PersonDto personDto) {
        // do something
    }

}
