package com.dribble.summerproject;

import com.dribble.summerproject.mvp.MVPRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RepoTest {

    @Autowired
    private MVPRepo repo;
}
