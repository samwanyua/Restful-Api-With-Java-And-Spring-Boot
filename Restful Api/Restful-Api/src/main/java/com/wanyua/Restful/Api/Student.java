package com.wanyua.Restful.Api;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="STUDENT")
public class Student {
    @Id
    @Column(name="ID")
    private int id;
    @Column(name="FIRSTNAME")
    private String firstName;
    @Column(name="LASTNAME")
    private String lastName;
    @Column(name="MARKS")
    private int marks;
    @Column(name="MENTOR")
    private String mentor;
    @Column(name="COMPANY")
    private String desiredCompany;

}
