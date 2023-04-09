package com.promineotech;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		String str="***"+log+"***";
		System.out.println(str);

	}

	@Override
	public void Error(String error) {
		String str="***Error:"+error+"***";
		String strBox="";
		for(int i=0;i<str.length();i++) {
			strBox+="*";
		}
		System.out.println(strBox);
		System.out.println(str);
		System.out.println(strBox);

	}

}
