package com.b2c.api.exception;


import com.b2c.api.controller.PaymentController;
import com.b2c.api.dto.errors.B2CApiErrorsDTO;
import com.b2c.api.dto.errors.ErrorDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;


@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(PaymentController.class);


    @ExceptionHandler({NotFoundException.class, ResponseStatusException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    //public ResponseEntity<ErrorDto> handleNotFoundException(NotFoundException ex) {
       // ErrorDto errorDto = new ErrorDto(HttpStatus.NOT_FOUND.getReasonPhrase(), ex.getLocalizedMessage(), HttpStatus.NOT_FOUND.value());
       // return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
   // }

    public ResponseEntity<String> handleResponseStatusException(ResponseStatusException ex) {
        log.error("Error occurred: {}", ex.getReason());
        return new ResponseEntity<>(ex.getReason(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        log.error("Internal server error: {}", ex.getMessage());

        return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<B2CApiErrorsDTO> handleValidationException(MethodArgumentNotValidException ex) {
        StringBuilder errors = new StringBuilder("Validation failed: ");
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            log.error("Validation error on field '{}': {}", error.getField(), error.getDefaultMessage());
            errors.append(error.getDefaultMessage()).append("; ");
        });
        B2CApiErrorsDTO errorResponse = new B2CApiErrorsDTO();
        B2CApiErrorsDTO.ResponseBody responseBody = new B2CApiErrorsDTO.ResponseBody();
//        errorResponse.setResponseCode("1");
//        errorResponse.setResponseMessage("Failed");
//        errorResponse.setMessageId("");
        responseBody.setStatus(errors.toString());
        errorResponse.setResponseBody(responseBody);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }


}
