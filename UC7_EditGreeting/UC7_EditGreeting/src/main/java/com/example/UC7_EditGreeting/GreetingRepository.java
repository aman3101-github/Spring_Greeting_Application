package com.example.UC7_EditGreeting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long>{
    // Interacts with the H2 Database
}
