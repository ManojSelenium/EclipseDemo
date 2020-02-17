package com.pack;

public class TestImpl implements Test {

	@Override
	public void add() {
		System.out.println("Add block");

	}

	@Override
	public void div() {
		System.out.println("Div block");

	}
	
	
	public static void main(String[] args) {
		TestImpl testImpl=new TestImpl();
		testImpl.add();
		testImpl.div();
	}

}
