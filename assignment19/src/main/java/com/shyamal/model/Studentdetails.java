package com.shyamal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@DynamicInsert(value=true)
public class Studentdetails {
	@Id
	
  private Integer sid;
	private String dname;

  private String Saddress;

   private Integer eage;

public Studentdetails() {
	System.out.println("Hibernate using zero argument constructors");
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getSaddress() {
	return Saddress;
}
public void setSaddress(String saddress) {
	Saddress = saddress;
}
public Integer getEage() {
	return eage;
}
public void setEage(Integer eage) {
	this.eage = eage;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", dname=" + dname + ", Saddress=" + Saddress + ", eage=" + eage + "]";
}


}
