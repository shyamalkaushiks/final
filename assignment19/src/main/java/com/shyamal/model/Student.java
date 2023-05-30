package com.shyamal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@javax.persistence.Entity
@Table(name="student")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private Integer sid;

    @Column(name = "sname")
    private String sname;

    @Column(name = "sage")
    private Integer sage;

    @Column(name = "saddress")
    private String saddress;
}
