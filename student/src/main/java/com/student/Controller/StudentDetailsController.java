package com.student.Controller;

import com.student.Entity.StudentDetails;
import com.student.Service.StudentDetailsService;
import com.student.dto.StudentDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDetailsController {
    @Autowired
    StudentDetailsService studentDetailsService;

    @PostMapping("/addDetails")
    public StudentDetails addDetails(@RequestBody StudentDetails studentDetails){
        return studentDetailsService.saveDetails(studentDetails);
    }

    @PostMapping("/addAllDetails")
    public List<StudentDetails> addAllDetails(@RequestBody List<StudentDetails> studentDetails){
        return studentDetailsService.saveAllDetails(studentDetails);
    }

    @GetMapping("/getDetails")
    public List<StudentDetails> findDetails(){
        return studentDetailsService.getDetails();
    }

    @GetMapping("/post/{id}")
    StudentDetailsDto getDetailsByID(@PathVariable int id){
        return studentDetailsService.getDetailsByID(id);
    }

}
