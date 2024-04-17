package com.chainsys.oops1;

import java.util.Scanner;

public class BankMain {
	
	
	double amount;
public void getUserDetails(BankInformation input) {
	Validation validate=new Validation();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a UserName :");
	input.setUserName(sc.next());
	/*if(!validate.numberchecker(input.userName)) {
		return;
	}*/
	while (!validate.numberchecker(input.userName)) {
        input.userName = sc.next();
    }
	while(!validate.validateString(input.userName)) {
		input.userName=sc.next();
	}
   // input.setUserName(input.userName);
	
	
//	if(!validate.isSpecialChar(userName)) {
//		return;
//	}
	
	System.out.println("Enter a Account Number:");
	input.setAccountNo( sc.next());
	while(!validate.validateString1(input.accountNo)) {
		input.accountNo=sc.next();
	}
//	if(validate.isSpecialChar(accountNo)) {
//		return;
//	}
	
	System.out.println("Enter your Bank Location:");
	input.setBankLocation(sc.next());
//	if(!validate.isSpecialChar(bankLocation)) {
//		return;
//	}

	System.out.println("Enter your Account Type:");
	input.setAccountType(sc.next());
	
	
	
	
	System.out.println("Enter your Amount:");
	input.setAmount(sc.nextInt());
	while (!validate.inputchecker1(input.amount)) {
        input.amount = sc.nextDouble();
    }
	/*if(!validate.inputchecker1(amount)) {
		return;
	}*/
	sc.close();
}
public  void printUserDetails(BankInformation input) {
	System.out.println(input);

	System.out.println("UserName:"+input.getUserName());
	System.out.println("AccountNumber:"+input.getAccountNo());
	System.out.println("Bank Location:"+input.getBankLocation());
	System.out.println("Account Type:"+input.getAccountType());

	System.out.println("Amount:"+input.getAmount());
}
public void deposit(double amount) {
	 int totalAmount=20000;
	double total=amount+totalAmount;
	System.out.println("Total amount in your account is:"+total);
}
public void deposit(double amount, String userName) {
	 int totalAmount=20000;
	double total=amount+totalAmount;
	System.out.println("Total amount in your account is:"+total +" depositer Name :" +userName);
}
	public static void main(String[] args) {
BankMain bm=new BankMain();
BankInformation input=new BankInformation();

bm.getUserDetails(input);
bm.printUserDetails(input);
bm.deposit(input.getAmount());
bm.deposit(input.getAmount(),input.getUserName());
	}

}
