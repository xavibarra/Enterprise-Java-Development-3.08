package com.ironhack.lab308.model.exercise2;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String presentationDuration;
    @ManyToOne
    @JoinColumn(name = "conference_id")
    private List<Conference> conference;

    public Speaker() {
    }

    public Speaker(Long id, String name, String presentationDuration, Conference conference) {
        this.id = id;
        this.name = name;
        this.presentationDuration = presentationDuration;
        this.conference = (List<Conference>) conference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(String presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public Conference getConference() {
        return (Conference) conference;
    }

    public void setConference(Conference conference) {
        this.conference = (List<Conference>) conference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speaker speaker = (Speaker) o;
        return Objects.equals(id, speaker.id) && Objects.equals(name, speaker.name) && Objects.equals(presentationDuration, speaker.presentationDuration) && Objects.equals(conference, speaker.conference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, presentationDuration, conference);
    }
}
