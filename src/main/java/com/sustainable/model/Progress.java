package com.sustainable.model;

import jakarta.persistence.*;

@Entity
@Table(name = "progress")
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int lessonsCompleted;
    private int totalLessons;
    private int co2Saved;
    private int waterSaved;

    public Progress() {}

    public Progress(int lessonsCompleted, int totalLessons, int co2Saved, int waterSaved) {
        this.lessonsCompleted = lessonsCompleted;
        this.totalLessons = totalLessons;
        this.co2Saved = co2Saved;
        this.waterSaved = waterSaved;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public int getLessonsCompleted() { return lessonsCompleted; }
    public void setLessonsCompleted(int lessonsCompleted) { this.lessonsCompleted = lessonsCompleted; }

    public int getTotalLessons() { return totalLessons; }
    public void setTotalLessons(int totalLessons) { this.totalLessons = totalLessons; }

    public int getCo2Saved() { return co2Saved; }
    public void setCo2Saved(int co2Saved) { this.co2Saved = co2Saved; }

    public int getWaterSaved() { return waterSaved; }
    public void setWaterSaved(int waterSaved) { this.waterSaved = waterSaved; }
}