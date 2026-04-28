package com.sustainable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.sustainable.model.ProjectIdea;
import com.sustainable.repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository repo;

    public ProjectIdea addProject(ProjectIdea project) {
        return repo.save(project);
    }

    public List<ProjectIdea> getProjects() {
        return repo.findAll();
    }
}