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
   @Column(name="employee_id")
	private int employeeId;
	
    public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public Date getDateofBirth() {
	return dateofBirth;
}
public void setDateofBirth(Date dateofBirth) {
	this.dateofBirth = dateofBirth;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
	@Column(name="firstName")
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
public Employee(int employeeId, String FirstName, String LastName, Date dateofBirth, String email, String phoneNumber) {
	super();
	this.employeeId = employeeId;
	this.firstName = FirstName;
	LastName = LastName;
	this.dateofBirth = dateofBirth;
	this.email = email;
	this.phoneNumber = phoneNumber;
}
   
   

}
