package com.promineotech;

public class SpacedLogger implements Logger {
    /**
     * This method prints the with space
     * each character in the string passed
     */
	@Override
	public void Log(String log) {
		
		String str="";
		for(int i=0;i<log.length();i++) {
			str+=log.charAt(i)+" ";
		}
		System.out.println(str);

	}
	/**
	 * This method prints the with space
     * each character in the string passed
     * appended with ERROR 
	 */
	@Override
	public void Error(String error) {
		String str="";
		for(int i=0;i<error.length();i++) {
			str+=error.charAt(i)+" ";
		}
		System.out.println("ERROR:"+str);

	}

}
