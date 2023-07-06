package com.student.Service;

import com.student.Entity.StudentDetails;
import com.student.Repository.StudentDetailsRepository;
import com.student.dto.StudentDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDetailsService {
    @Autowired
    StudentDetailsRepository studentDetailsRepository;

    public StudentDetails saveDetails(StudentDetails studentDetails) {
        return studentDetailsRepository.save(studentDetails);
    }

    public List<StudentDetails> saveAllDetails(List<StudentDetails> studentDetails) {
        return studentDetailsRepository.saveAll(studentDetails);
    }

    public List<StudentDetails> getDetails() {
        return studentDetailsRepository.findAll();
    }

    public List<StudentDetails> sum() {
        List<StudentDetails> Students = studentDetailsRepository.findAll();
        System.out.println("Details -------"+Students);
        return Students;
    }

    public StudentDetailsDto getDetailsByID(int id) {
        return studentDetailsRepository.getDetailsByID(id);
    }

}
