package com.student.Controller;

import com.student.Entity.Subjects;
import com.student.Repository.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectsController {
    @Autowired
    SubjectsRepository subjectsRepository;
    @GetMapping("/getData")
    public List<Subjects> getStudentData(){
        return (List<Subjects>) subjectsRepository.findAll();
    }


}
