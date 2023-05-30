package com.shyamal.model;

import java.io.Serializable;

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
public class Student implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer sid;
public String sname;
public Integer sage;
public String saddress;
}
