package com.chainsys.oops1;

public class GroupB extends GroupA{
	
	    public String[] subjects = {"Accounts", "Computer Application", "Commerce", "Tamil", "English"};

	    public void displaySubjects() {
	        System.out.println("Subjects for Group B:");
	        for (int i = 0; i < subjects.length; i++) {
	            System.out.println((i + 1) + ". " + subjects[i]);
	        }
	    }
	}


