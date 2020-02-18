package com.employee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="employee")
public class Employee {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="employeId")
	private int employeeId;
	
    @Column(name="firstNmae")
	private String firstName;
	
    @Column(name="lastName")
	private String  LastName;
	
    @Column(name="date_of_birth")
	private Date dateofBirth;
	
    @Column(name="email")
	private String email;
	
   @Column(name="phoneNumber")
	private String phoneNumber;

   public Employee() {
	   
   }
public Employee(int employeeId, String firstName, String lastName, Date dateofBirth, String email, String phoneNumber) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	LastName = lastName;
	this.dateofBirth = dateofBirth;
	this.email = email;
	this.phoneNumber = phoneNumber;
}
   
   

}
