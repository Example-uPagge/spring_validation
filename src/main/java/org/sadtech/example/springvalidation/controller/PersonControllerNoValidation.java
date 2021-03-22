package org.sadtech.example.springvalidation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sadtech.example.springvalidation.dto.PersonDto;
import org.sadtech.example.springvalidation.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/no-valid/person")
@Tag(name = "Пользователи системы 2", description = "Валидация на уровне сервиса")
@RequiredArgsConstructor
public class PersonControllerNoValidation {

    private final PersonService personService;

    @PostMapping
    @Operation(summary = "Сохранение пользователя")
    public ResponseEntity<String> save(@RequestBody PersonDto personDto) {
        personService.save(personDto);
        return ResponseEntity.ok("valid");
    }

}
