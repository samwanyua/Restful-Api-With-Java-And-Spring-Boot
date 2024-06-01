package com.wanyua.Restful.Api.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // add getters and setters
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity // allows to put the book entity into a table and retrieve it
@Table(name="books")
public class BookEntity {
    @Id
    private  String isbn;
    private String author;
    private  String title;

}
