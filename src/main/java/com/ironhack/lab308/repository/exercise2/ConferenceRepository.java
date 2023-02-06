package com.ironhack.lab308.repository.exercise2;

import com.ironhack.lab308.model.exercise2.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
