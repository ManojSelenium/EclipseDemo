package com.pack;

public class Excel implements MsOffice{

	@Override
	public void open() {
		System.out.println("This will open excel");
		
	}

	@Override
	public void edit() {
		System.out.println("This will edit excel");
		
	}

	@Override
	public void close() {
		System.out.println("This will close excel");
		
	}

}
