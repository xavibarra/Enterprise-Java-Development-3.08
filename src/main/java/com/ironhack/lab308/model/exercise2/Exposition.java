package com.ironhack.lab308.model.exercise2;

import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class Exposition extends Event{
    public Exposition() {
    }

    public Exposition(Long id, Date date, double duration, String location, String title, List<Guest> guestList) {
        super(id, date, duration, location, title, guestList);
    }

}
