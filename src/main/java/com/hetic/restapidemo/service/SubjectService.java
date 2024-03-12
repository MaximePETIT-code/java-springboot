package com.hetic.restapidemo.service;

import com.hetic.restapidemo.dto.Book;
import com.hetic.restapidemo.dto.Subject;
import com.hetic.restapidemo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    public Subject addSubject(Subject student) {
        return subjectRepository.save(student);
    }

    public Optional<Subject> findById(@PathVariable Long id){
        return subjectRepository.findById(id);
    }

    public Long deleteById(@PathVariable Long id){
        subjectRepository.deleteById(id);
        return id;
    }
}