package org.sadtech.example.springvalidation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sadtech.example.springvalidation.dto.PersonDto;
import org.sadtech.example.springvalidation.repository.PersonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/valid-repa/person")
@Tag(name = "Пользователи системы 3", description = "Валидация на уровне репозитория")
public class PersonControllerValidRepository {

    private final PersonRepository personRepository;

    @PostMapping
    @Operation(summary = "Сохранение пользователя")
    public ResponseEntity<PersonDto> save(@RequestBody PersonDto personDto) {
        return ResponseEntity.ok(personRepository.save(personDto));
    }

}
