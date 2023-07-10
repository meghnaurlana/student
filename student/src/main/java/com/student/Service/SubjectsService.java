package com.student.Service;

import com.student.Entity.Subjects;
import com.student.Repository.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SubjectsService {
    @Autowired
    SubjectsRepository subjectsRepository;

    public List<Subjects> getAllMarksByExamType(String examType){
        return subjectsRepository.getAllMarksByExamType(examType);
    }

    public  List<Subjects> getAllSubjects(){
        return (List<Subjects>) subjectsRepository.findAll();
    }



}
