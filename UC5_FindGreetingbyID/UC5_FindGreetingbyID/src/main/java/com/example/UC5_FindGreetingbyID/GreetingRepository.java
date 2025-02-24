package com.example.UC5_FindGreetingbyID;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GreetingRepository extends JpaRepository<Greeting, Long>{
    // this interface handles the DB operations
}
