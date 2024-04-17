package com.chainsys.oops1;

import java.util.Scanner;

public class BookInformation {

	public static void main(String[] args) {
		Validation validate = new Validation();
		String bkName;
		int id;
		int year;
		String genre;
		int pgNo;
		BookSubClass input = new BookSubClass();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Book Name:");
		input.setBookName(bkName = sc.next());
		while (!validate.numberchecker(input.bookName)) {
	        input.bookName = sc.next();
	    }
		while(!validate.validateString(input.bookName)) {
			input.bookName=sc.next();
		}

		System.out.println("Enter a BookId:");
		input.setBookId(id = sc.nextInt());
		while (!validate.inputchecker(input.bookId)) {
	        input.bookId = sc.nextInt();
	    }
		/*if (!validate.inputchecker(id)) {
			return;
		}*/
		System.out.println("Enter a Book Published:");
		input.setBookPublished(year = sc.nextInt());
		while (!validate.inputchecker(input.bookPublished)) {
	        input.bookPublished= sc.nextInt();
	    }

		
		System.out.println("Enter a Genre of Book:");
		input.setBookGenre(genre = sc.next());
		if (!validate.numberchecker(genre)) {
			return;
		}

		System.out.println("Enter a Book Page number:");
		input.setBookPgNo(pgNo = sc.nextInt());
		if (!validate.inputchecker(pgNo)) {
			return;
		}

		System.out.println("Book Name:" + input.getBookName());
		System.out.println("Book Id:" + input.getBookId());
		System.out.println("Published Book Year:" + input.getBookPublished());
		System.out.println("Genre of Book:" + input.getBookGenre());
		System.out.println("No of Pages in Book:" + input.getBookPgNo());

	}

}
