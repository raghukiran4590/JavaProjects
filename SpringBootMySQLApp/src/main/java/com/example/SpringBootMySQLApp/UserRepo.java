package com.example.SpringBootMySQLApp;

import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {

    @Lock(LockModeType.OPTIMISTIC_FORCE_INCREMENT)
    Optional<User> findById(Integer id);

}
