package org.sadtech.example.springvalidation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.sadtech.example.springvalidation.dto.PersonDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/person")
@Tag(name = "Пользователи системы")
public class PersonController {

    @PostMapping
    @Operation(summary = "Валидация на уровне контроллера")
    public ResponseEntity<String> valid(@Valid @RequestBody PersonDto personDto) {
        return ResponseEntity.ok("valid");
    }

}
