package com.ironhack.lab308.model.exercise1;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chapter {
    @Id
    private String name;
    private String district;
    @OneToOne
    private Member president;
    @OneToMany(mappedBy = "chapter")
    private List<Member> members;


    @ManyToOne
    @JoinColumn(name = "association_id")
    private Association association;

    public Chapter() {
    }

    public Chapter(String name, String district, Member president, List<Member> members) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}