package com.example.UC6_ListAllGreetings;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  GreetingRepository extends JpaRepository<Greeting, Long> {
    // This handles the DB operations
}
