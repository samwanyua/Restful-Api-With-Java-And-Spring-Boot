package com.wanyua.Restful.Api.Controller;

import com.wanyua.Restful.Api.Entity.StudentEntity;
import com.wanyua.Restful.Api.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/addStudent")
    public StudentEntity postDetails(@RequestBody StudentEntity studentEntity){
        return studentService.saveDetails(studentEntity);
    }
    @GetMapping("/getAllStudents")
    public List<StudentEntity> getDetails(){
        return studentService.getAllDetails();
    }

}
