package com.student.Service;

import com.student.Entity.StudentDetails;
import com.student.Entity.Subjects;
import com.student.Repository.StudentDetailsRepository;
import com.student.Repository.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public StudentDetails getStudentDetails(int StudentID) {
        return studentDetailsRepository.findById(StudentID).orElse(null);
    }

    public Map<String, Object> getStudentMarks(int StudentId) {
        Map<String, Object> result = new HashMap<>();
        StudentDetails studentDetails = studentDetailsRepository.findById(StudentId).orElse(null);
        if (studentDetails != null) {
            List<Subjects> subjects = studentDetails.getSubjects();
            int totalMarks = 0;
            for (Subjects subject : subjects) {
                totalMarks += subject.getTelugu() + subject.getHindi() + subject.getEnglish() + subject.getMaths() + subject.getScience() + subject.getSocial();
            }
            int averageMarks = totalMarks / subjects.size();
            result.put("student", studentDetails);
            result.put("totalMarks", totalMarks);
            result.put("averageMarks", averageMarks);

        }
        return result;
    }

    public StudentDetails getClassTopper() {
        return studentDetailsRepository.classTopper();
    }

}
