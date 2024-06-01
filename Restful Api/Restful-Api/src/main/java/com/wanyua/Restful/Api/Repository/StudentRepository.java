package com.wanyua.Restful.Api.Repository;

import com.wanyua.Restful.Api.Models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> { // Students is the Model class and Integer is the Primary key type
}
