package com.java.collection;

public class Student {
	int roll_no;
String name;
String subject;

public Student(int rollno,String name,String subject ) {
	this.roll_no=rollno;
	this.name=name;
	this.subject=subject;
}
public String toString(){
	return name+""+roll_no+""+subject;
	
	
	

}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}

}
