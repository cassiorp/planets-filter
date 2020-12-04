package com.forttiori.planetsfilter.Controller.Exceptionhandlers;

import com.forttiori.planetsfilter.Exceptions.PageNotFoundExcepetion;
import com.forttiori.planetsfilter.Exceptions.PlanetNotFoundException;
import com.forttiori.planetsfilter.Response.PlanetInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.OffsetDateTime;

@ControllerAdvice
public class ApiExceptionHandler{

    @ExceptionHandler(PageNotFoundExcepetion.class)
    public ResponseEntity<StandardError> paginaNaoEcontrada(PageNotFoundExcepetion e) {
        StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), OffsetDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

    @ExceptionHandler(PlanetNotFoundException.class)
    public ResponseEntity<StandardError> planetaNaoEcontrada(PlanetNotFoundException e) {
        StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), OffsetDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

}
