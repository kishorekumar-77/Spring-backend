package com.sustainable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.sustainable.model.ProjectIdea;
import com.sustainable.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin("*")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @PostMapping
    public ProjectIdea addProject(@RequestBody ProjectIdea project) {
        return service.addProject(project);
    }

    @GetMapping
    public List<ProjectIdea> getProjects() {
        return service.getProjects();
    }
}