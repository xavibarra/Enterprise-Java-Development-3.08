package com.ironhack.lab308.model.exercise2;

import com.ironhack.lab308.enums.exercise2.StatusGuest;
import jakarta.persistence.*;

@Entity
public class Guest {
    @Id
    private String name;
    @Enumerated(EnumType.STRING)
    private StatusGuest guestStatus;
    @ManyToOne
    private Event event;

}
