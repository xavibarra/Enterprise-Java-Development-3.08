package com.ironhack.lab308.repository.exercise1;

import com.ironhack.lab308.model.exercise1.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository extends JpaRepository<Association, Long> {
}
