package com.forttiori.planetsfilter.Controller.Exceptionhandlers;

import com.forttiori.planetsfilter.Exceptions.PageNotFoundException;
import com.forttiori.planetsfilter.Exceptions.PlanetNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.OffsetDateTime;

@ControllerAdvice
public class ApiExceptionHandler{

    @ExceptionHandler(PageNotFoundException.class)
    public ResponseEntity<StandardError> paginaNaoEcontrada(PageNotFoundException e) {
        StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), OffsetDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

    @ExceptionHandler(PlanetNotFoundException.class)
    public ResponseEntity<StandardError> planetaNaoEcontrada(PlanetNotFoundException e) {
        StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), OffsetDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

}
