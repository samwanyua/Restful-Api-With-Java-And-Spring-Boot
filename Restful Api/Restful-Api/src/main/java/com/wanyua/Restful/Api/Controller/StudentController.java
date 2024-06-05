package com.wanyua.Restful.Api.Controller;

import com.wanyua.Restful.Api.Entity.StudentEntity;
import com.wanyua.Restful.Api.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getStudentById/{id}")
    public StudentEntity getById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @PutMapping("updateStudent")
    public StudentEntity updateStudentDetails(@RequestBody StudentEntity studentEntity){
        return studentService.updateDetail(studentEntity);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudentById(@PathVariable int id){
        return studentService.deleteDetail(id);
    }

}
