package com.promineotech;

public class AsteriskLogger implements Logger {
    /**
     * This method append *** before and after
     * the string passed and prints to console
     */
	@Override
	public void Log(String log) {
		String str="***"+log+"***";
		System.out.println(str);

	}
	/**
	 * This method prints the string passed box o
	 * as described below
	 * ********************
	 * ***Error:String*****
	 * ********************
	 */
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
