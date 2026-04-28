package com.sustainable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.sustainable.model.Progress;
import com.sustainable.service.ProgressService;

@RestController
@RequestMapping("/api/progress")
@CrossOrigin("*")
public class ProgressController {

    @Autowired
    private ProgressService service;

    @PostMapping
    public Progress saveProgress(@RequestBody Progress progress) {
        return service.saveProgress(progress);
    }

    @GetMapping
    public List<Progress> getProgress() {
        return service.getAllProgress();
    }
}