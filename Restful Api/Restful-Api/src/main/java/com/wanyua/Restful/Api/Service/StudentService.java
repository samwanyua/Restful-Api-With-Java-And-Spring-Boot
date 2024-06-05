package com.wanyua.Restful.Api.Service;

import com.wanyua.Restful.Api.Entity.StudentEntity;
import com.wanyua.Restful.Api.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired // dependency injection
    private StudentRepo studentRepo;

    public StudentEntity saveDetails(StudentEntity studentEntity){
        return studentRepo.save(studentEntity);
    }

    public List<StudentEntity> getAllDetails(){
        return studentRepo.findAll();
    }

}
