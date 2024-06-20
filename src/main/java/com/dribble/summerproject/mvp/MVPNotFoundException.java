package com.dribble.summerproject.mvp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MVPNotFoundException extends RuntimeException {
    public MVPNotFoundException() {
        super("MVP not found!");
    }
}
