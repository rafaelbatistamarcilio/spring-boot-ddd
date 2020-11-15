package com.dddapp.infrastructure.adapters.input.controllers;

import javax.validation.Valid;

import com.dddapp.domain1.interfaces.IDomain1Service;
import com.dddapp.domain1.model.Domain1Exception;
import com.dddapp.domain1.model.MyDomain1Entity;
import com.dddapp.infrastructure.adapters.input.controllers.model.AddDomain1Request;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AppController {

    private IDomain1Service service;

    public AppController(IDomain1Service service) {
        this.service = service;
    }

    @GetMapping("{name}")
    public ResponseEntity<MyDomain1Entity> findByName(@PathVariable("name") String name) {
        return ResponseEntity.ok(this.service.findByName(name));
    }

    @PostMapping
    public ResponseEntity<MyDomain1Entity> add(@Valid @RequestBody AddDomain1Request body) throws Domain1Exception {
        var model = body.convertToModel();
        var savedModel = this.service.add(model);
        return ResponseEntity.ok(savedModel);
    }

    @ExceptionHandler({ Domain1Exception.class, Exception.class })
    public ResponseEntity<Error> handler(Exception e) {
        var error = new Error();
        error.message = e.getMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }

    public class Error {
        String message;
    }
}
