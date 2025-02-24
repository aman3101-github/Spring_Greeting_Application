package com.example.UC4_Save.Greeting.in.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This repository handles the DB operation
@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
