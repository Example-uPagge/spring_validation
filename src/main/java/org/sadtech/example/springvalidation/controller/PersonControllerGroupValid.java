package org.sadtech.example.springvalidation.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.sadtech.example.springvalidation.dto.PersonDto;
import org.sadtech.example.springvalidation.valid.Marker;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/api/group-valid/person")
@Tag(name = "Группы валидаций")
public class PersonControllerGroupValid {

    @PostMapping
    @Validated({Marker.OnCreate.class})
    public ResponseEntity<String> create(@RequestBody @Valid PersonDto personDto) {
        return ResponseEntity.ok("valid");
    }

    @PutMapping
    @Validated(Marker.OnUpdate.class)
    public ResponseEntity<String> update(@RequestBody @Valid PersonDto personDto) {
        return ResponseEntity.ok("valid");
    }

}
