package com.sustainable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sustainable.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}