package com.sustainable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sustainable.model.Progress;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
	
}