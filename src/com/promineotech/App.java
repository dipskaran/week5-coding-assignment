package com.promineotech;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String print="Skywalker";
		Logger al = new AsteriskLogger();
		al.Log(print);
		al.Error(print);
		Logger sl = new SpacedLogger();
		sl.Log(print);
		sl.Error(print);

	}

}
