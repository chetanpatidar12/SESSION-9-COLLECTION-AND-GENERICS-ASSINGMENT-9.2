package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestStudent {
	
	public static void main(String[] args) {
		
	
		
		List<Student>  s=new ArrayList<Student>();
		s.add(new Student(101, "chetan", "mathes"));
		s.add(new Student(101, "chetan", "mathes"));
		s.add(new Student(103, "aman", "bio"));
		s.add(new Student(104, "piyush", "mathes"));
		s.add(new Student(101, "chetan", "mathes"));
		
		 List<Student> list= new ArrayList();
		 
		  list.addAll(s);
		  
		  
		   Set empIds= new HashSet();//flag that keeps employee ids
		  
		  for(Iterator it=list.listIterator();it.hasNext();){
		  Student stu=(Student)it.next();
		  
		   
		   if(empIds.add(stu.getRoll_no())==false){//if found duplicate remove from the list
		    it.remove();
		   }
		  }
		  
		  for(Student stu:list){
		   System.out.println(stu.getRoll_no());
		   System.out.println(stu.getName());
		  }
		  
		 
		
	}}
	
	

