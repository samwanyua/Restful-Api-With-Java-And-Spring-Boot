package com.wanyua.Restful.Api.Repository;

import com.wanyua.Restful.Api.Domain.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BookRepository extends JpaRepository<BookEntity, String> {

}
