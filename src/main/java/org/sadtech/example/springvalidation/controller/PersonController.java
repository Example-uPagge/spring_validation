package org.sadtech.example.springvalidation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.sadtech.example.springvalidation.dto.PersonDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Validated
@RestController
@RequestMapping("/api/person")
@Tag(name = "Пользователи системы", description = "Валидация на уровне контроллера")
public class PersonController {

    @PostMapping
    @Operation(summary = "Сохранение пользователя")
    public ResponseEntity<String> save(@Valid @RequestBody PersonDto personDto) {
        return ResponseEntity.ok("valid");
    }

    @GetMapping("{id}")
    @Operation(summary = "Получить пользователя по id")
    public ResponseEntity<String> getById(
            @PathVariable("id") @Min(0) int personId
    ) {
        return ResponseEntity.ok("valid");
    }

    @GetMapping
    @Operation(summary = "Получить пользователя по имени")
    public ResponseEntity<String> getByName(
            @RequestParam("name") @NotBlank String name
    ) {
        return ResponseEntity.ok("valid");
    }

}
