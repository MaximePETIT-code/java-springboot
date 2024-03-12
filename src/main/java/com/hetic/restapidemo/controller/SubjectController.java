package com.hetic.restapidemo.controller;

import com.hetic.restapidemo.dto.Book;
import com.hetic.restapidemo.dto.Subject;
import com.hetic.restapidemo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List<Subject> getSubjects() {
        return subjectService.getSubjects();
    }

    @PostMapping
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectService.addSubject(subject);
    }

    @GetMapping("/{id}")
    public Optional<Subject> findById(@PathVariable Long id){
        return subjectService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Long deleteById(@PathVariable Long id){
        subjectService.deleteById(id);
        return id;
    }
}