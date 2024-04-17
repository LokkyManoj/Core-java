package com.chainsys.oops1;

import java.util.Scanner;

public class GroupMain {

	public static void main(String[] args) {
		Validation validate=new Validation();
	GroupPojo input=new GroupPojo();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a School Name :");
	input.setSchoolName(sc.next());
	while (!validate.numberchecker(input.schoolName)) {
        input.schoolName = sc.next();
    }
	while(!Validation.validateString(input.schoolName)) {
		input.schoolName=sc.next();
	}

	
	
	System.out.println("Enter a School Id  :");
	input.setSchoolId(sc.next());
	while(!Validation.validateString1(input.schoolId)) {
		input.schoolId=sc.next();
	}
	

	System.out.println("Enter a GroupType(GroupA / GroupB):");
	input.setGroupType(sc.next());
	
	
	System.out.println("School Name:"+input.getSchoolName());
	System.out.println("School id:"+input.schoolId);
	System.out.println("Group Type:"+input.getGroupType());
	GroupA1 ga=new GroupA1();
	
	GroupB gb=new GroupB();
	
	if(input.groupType.equals("GroupA")) {
		System.out.println("Group A: Computer Science :");
		ga.displaySubjects();
	}
if(input.groupType.equals("GroupB")) {
	System.out.println("Group B: Commerce :");

	gb.displaySubjects();
}
sc.close();
	}


}
