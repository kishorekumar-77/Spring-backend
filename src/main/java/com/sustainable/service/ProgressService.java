package com.sustainable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.sustainable.model.Progress;
import com.sustainable.repository.ProgressRepository;

@Service
public class ProgressService {

    @Autowired
    private ProgressRepository repo;

    public Progress saveProgress(Progress progress) {
        return repo.save(progress);
    }

    public List<Progress> getAllProgress() {
        return repo.findAll();
    }
}