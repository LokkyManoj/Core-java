package com.chainsys.oops1;

public class GroupA1 extends GroupA {
	
	     String[] subjects = {"Maths", "Computer Science", "Physics", "Chemistry", "Tamil", "English"};

	    public void displaySubjects() {
	        System.out.println("Subjects for Group A:");
	        for (int i = 0; i < subjects.length; i++) {
	            System.out.println((i + 1) + ". " + subjects[i]);
	        }
	    }
	}


