package com.pack;

public class Word implements MsOffice{

	@Override
	public void open() {
		System.out.println("This will open word");
		
	}

	@Override
	public void edit() {
		System.out.println("This will edit word");
		
	}

	@Override
	public void close() {
		System.out.println("This will close word");
		
	}

}
