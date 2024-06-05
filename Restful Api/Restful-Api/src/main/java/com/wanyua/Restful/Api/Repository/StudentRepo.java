package com.wanyua.Restful.Api.Repository;

import com.wanyua.Restful.Api.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}
