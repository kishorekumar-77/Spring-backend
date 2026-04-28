package com.sustainable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.sustainable.model.Lesson;
import com.sustainable.repository.LessonRepository;

@Service
public class LessonService {

    @Autowired
    private LessonRepository repo;

    public Lesson addLesson(Lesson lesson) {
        return repo.save(lesson);
    }

    public List<Lesson> getAllLessons() {
        return repo.findAll();
    }
}