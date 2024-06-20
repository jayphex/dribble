package com.dribble.summerproject.mvp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class MVPController {

    @GetMapping("/hello")
    String home() {
        return "Hello!";
    }

    private final MVPRepo repo;

    MVPController(MVPRepo mvpRepo) {
        this.repo = mvpRepo;
    }

    @GetMapping("/allmvps")
    List<MVP> findAll() {
        return this.repo.findAll();
    }

    @GetMapping("/mvp/{date}")
    MVP findByDate(@PathVariable int date) {
        Optional<MVP> mvp = this.repo.findByDate(date);
        if (mvp.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return mvp.get();
    }

}
