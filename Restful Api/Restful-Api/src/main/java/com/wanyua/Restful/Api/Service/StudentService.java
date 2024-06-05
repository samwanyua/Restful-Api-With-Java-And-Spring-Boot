package com.wanyua.Restful.Api.Service;

import com.wanyua.Restful.Api.Entity.StudentEntity;
import com.wanyua.Restful.Api.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {
    @Autowired // dependency injection
    private StudentRepo studentRepo;

    public StudentEntity saveDetails(StudentEntity studentEntity){
        return studentRepo.save(studentEntity);
    }
// Fetching all data function
    public List<StudentEntity> getAllDetails(){
        return studentRepo.findAll();
    }
//    Fetching data by ID
    public StudentEntity getStudentById(int id){
        return studentRepo.findById(id).orElse(null);
    }
//    Updating details
    public StudentEntity updateDetail(StudentEntity studentEntity){
        StudentEntity updateStudent = studentRepo.findById(studentEntity.getId()).orElse(null);
        if(updateStudent !=null){
            updateStudent.setMentor(studentEntity.getMentor());
            updateStudent.setFirstName(studentEntity.getFirstName());
            updateStudent.setLastName(studentEntity.getLastName());
            updateStudent.setRole(studentEntity.getRole());

            studentRepo.save(updateStudent);
            return updateStudent;
        }
        else{
            return  null;
        }
    }

}
