package com.ironhack.lab308.repository.exercise2;

import com.ironhack.lab308.model.exercise2.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
