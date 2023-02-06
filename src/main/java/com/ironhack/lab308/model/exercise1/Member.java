package com.ironhack.lab308.model.exercise1;
import com.ironhack.lab308.enums.exercise1.Status;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Member {
    @Id
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date renewalDate;
    @ManyToOne
    private Chapter chapter;

    public Member() {
    }

    public Member(String name, Status status, Date renewalDate, Chapter chapter) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
        this.chapter = chapter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
}