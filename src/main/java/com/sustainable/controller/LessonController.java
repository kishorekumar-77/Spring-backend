package com.sustainable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sustainable.model.Lesson;
import com.sustainable.service.LessonService;

@RestController
@RequestMapping("/api/lessons")
@CrossOrigin("*")
public class LessonController {

    @Autowired
    private LessonService service;

    // Admin → Add lesson
    @PostMapping
    public Lesson addLesson(@RequestBody Lesson lesson) {
        return service.addLesson(lesson);
    }

    // User → Get lessons
    @GetMapping
    public List<Lesson> getLessons() {
        return service.getAllLessons();
    }
}