package ru.alina.teamcitydemeone;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    @GetMapping("/")
    public ResponseEntity<?> getOne() {
        return new ResponseEntity<>("YOU ARE NUMBER ONE", HttpStatus.OK);
    }
}
