package com.ironhack.lab308.model.exercise2;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Conference extends Event{
    @ManyToMany(mappedBy = "conference")
    private List<Speaker> speakerList;

    public Conference() {
    }

    public Conference(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }

    public Conference(Long id, Date date, double duration, String location, String title, List<Guest> guestList, List<Speaker> speakerList) {
        super(id, date, duration, location, title, guestList);
        this.speakerList = speakerList;
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
