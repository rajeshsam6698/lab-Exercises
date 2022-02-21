package com.abc.Exercise3;

public class Password {
	public static void main(String[] args) {

		String name = "RajeshSambathula";
		String pass = "Rajesh@1998";
		Authentication p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("RajeshSambathula", "Rajesh@1998"));
	}
}
