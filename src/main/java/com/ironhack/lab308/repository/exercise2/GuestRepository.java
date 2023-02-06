package com.ironhack.lab308.repository.exercise2;

import com.ironhack.lab308.model.exercise2.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, String> {
}
