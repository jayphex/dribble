package com.dribble.summerproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataLoad implements CommandLineRunner {

    @Autowired
    private Repo repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new MVP(2020, "Nikola Jokic", "images/jokic.png"));
        repo.save(new MVP(2021, "Nikola Jokic", "images/jokic.png"));
        repo.save(new MVP(2022, "Nikola Jokic", "images/jokic.png"));
        repo.save(new MVP(2023, "Joel Embiid", "images/embiid.png"));
        repo.save(new MVP(2024, "Nikola Jokic", "images/jokic.png"));
    }
}
