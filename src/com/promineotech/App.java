package com.promineotech;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String print = sc.nextLine();
		//Creating an instance of Logger->AsteriskLogger
		Logger al = new AsteriskLogger();
		al.Log(print);
		al.Error(print);
		//Creating an instance of Logger->SpacedLogger
		Logger sl = new SpacedLogger();
		sl.Log(print);
		sl.Error(print);
		sc.close();
	}

}
