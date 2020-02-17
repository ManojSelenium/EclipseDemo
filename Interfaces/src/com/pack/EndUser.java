package com.pack;

public class EndUser {

	
	public static void main(String[] args) {
		
		MsOffice w=new Word();
		System.out.println("test");
		System.out.println("Adding new line ");
		
		w.open();
		w.close();
		w.close();
		
		
		MsOffice e=new Excel();
		e.open();
		e.edit();
		e.close();
		
		//MsOffice m=new MsOffice();
		
		
	}
}
