package com.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "error.email.already.verified", value= HttpStatus.BAD_REQUEST)
public class EmailAlreadyVerifiedException extends RuntimeException {
}
