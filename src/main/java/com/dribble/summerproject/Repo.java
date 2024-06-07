package com.dribble.summerproject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<MVP, Long> {
    MVP findByMwaka(int mwaka);
}
