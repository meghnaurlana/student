package com.student.Controller;

import com.student.Entity.Subjects;
import com.student.Repository.SubjectsRepository;
import com.student.Service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectsController {
    @Autowired
    SubjectsService subjectsService;


    @GetMapping("/getAllMarksByExamType/{examType}")
        public List<Subjects> getAllMarksByExamType(@PathVariable String examType){
        return subjectsService.getAllMarksByExamType(examType);
    }
    @GetMapping("/getAllSubjects")
    public List<Subjects> getAllSubjects() {
        return subjectsService.getAllSubjects();
    }
}
