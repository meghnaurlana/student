package com.student.Controller;

import com.student.Entity.StudentDetails;
import com.student.Service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class StudentDetailsController {
    @Autowired
    StudentDetailsService studentDetailsService;

    @PostMapping("/addDetails")
    public StudentDetails addDetails(@RequestBody StudentDetails studentDetails) {
        return studentDetailsService.saveDetails(studentDetails);
    }

    @PostMapping("/addAllDetails")
    public List<StudentDetails> addAllDetails(@RequestBody List<StudentDetails> studentDetails) {
        return studentDetailsService.saveAllDetails(studentDetails);
    }

    @GetMapping("/getDetails")
    public List<StudentDetails> findDetails() {
        return studentDetailsService.getDetails();
    }

    @GetMapping("/{studentId}")
    public StudentDetails getStudentDetails(@PathVariable int studentId){
        return studentDetailsService.getStudentDetails(studentId);
    }

    @GetMapping("student/{studentId}/marks")
    public Map<String, Object> getStudentMarks(@PathVariable int studentId){
        return studentDetailsService.getStudentMarks(studentId);
    }

@GetMapping("/classTopper")
    public StudentDetails getClassTopper(){
        return studentDetailsService.getClassTopper();
}
}
