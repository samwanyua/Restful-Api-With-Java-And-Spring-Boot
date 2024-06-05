package com.wanyua.Restful.Api.Service;

import com.wanyua.Restful.Api.Entity.StudentEntity;
import com.wanyua.Restful.Api.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired // dependency injection
    private StudentRepo studentRepo;

    public StudentEntity saveDetails(StudentEntity studentEntity){
        return studentRepo.save(studentEntity);
    }

}
