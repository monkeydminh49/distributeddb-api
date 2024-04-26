package org.e01.distributedsql.advice;


import lombok.extern.slf4j.Slf4j;
import org.e01.distributedsql.exception.NotFoundException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.LOWEST_PRECEDENCE)
@RestControllerAdvice
@Slf4j
public class GeneralCustomExceptionHandler extends ResponseEntityExceptionHandler {
//    @Override
//    public ResponseEntity<Object> handleHttpMessageNotReadable(
//            HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
//        ProblemDetail body = createProblemDetail(ex, status, "Missing request body", null, null, request);
//        return handleExceptionInternal(ex, body, headers, status, request);
//    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ProblemDetail handleNotFoundException(NotFoundException ex) {
        log.info("Handle not found exception");
        return ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, ex.getMessage());
    }


}