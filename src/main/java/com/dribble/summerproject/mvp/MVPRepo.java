package com.dribble.summerproject.mvp;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MVPRepo {

    private List<MVP> mvps = new ArrayList<>();


    public List<MVP> findAll() {
        return mvps;
    }

    public Optional<MVP> findByDate(int date) {
        return (mvps.stream()
                .filter(mvp -> mvp.getDate() == date)
                .findFirst());
    }

    @PostConstruct
    private void init() {
        mvps.add(new MVP(2020, "Nikola Jokic", "images/jokic.png"));
        mvps.add(new MVP(2021, "Nikola Jokic", "images/jokic.png"));
        mvps.add(new MVP(2022, "Nikola Jokic", "images/jokic.png"));
        mvps.add(new MVP(2023, "Joel Embiid", "images/embiid.png"));
        mvps.add(new MVP(2024, "Nikola Jokic", "images/jokic.png"));
    }

}
