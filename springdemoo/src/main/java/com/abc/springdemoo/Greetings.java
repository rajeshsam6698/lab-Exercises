package com.abc.springdemoo;

public class Greetings {

	private String msg;

	public Greetings(String msg) {
		super();
		this.msg = msg;
	}

	public void sayHello() {
		System.out.println("Message:" + msg);
	}

}