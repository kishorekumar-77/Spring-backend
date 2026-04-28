package com.sustainable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sustainable.model.ProjectIdea;

public interface ProjectRepository extends JpaRepository<ProjectIdea, Long> {
}