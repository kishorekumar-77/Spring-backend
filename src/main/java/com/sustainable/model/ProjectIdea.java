package com.sustainable.model;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class ProjectIdea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String theme;
    private String difficulty;
    private String impact;
    private String description;

    public ProjectIdea() {}

    public ProjectIdea(String title, String theme, String difficulty, String impact, String description) {
        this.title = title;
        this.theme = theme;
        this.difficulty = difficulty;
        this.impact = impact;
        this.description = description;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getTheme() { return theme; }
    public void setTheme(String theme) { this.theme = theme; }

    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }

    public String getImpact() { return impact; }
    public void setImpact(String impact) { this.impact = impact; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}