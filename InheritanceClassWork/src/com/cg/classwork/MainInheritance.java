package com.cg.classwork;

public class MainInheritance {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.readPersonDetails();
		stu.printPersonDetails();
		stu.readBatch();
		stu.readYear();
		stu.readFee();
		
		 
		Staff stf = new Staff();
		stf.readPersonDetails();
		stf.printPersonDetails();
		stf.readSchool();
		stf.readPay();
		
		

	}

}
