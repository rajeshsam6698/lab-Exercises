package com.abc.Exercise2;

interface sp {
	public StringBuffer s(String str);
}

public class Space {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sp obj = (str) -> {
			for (int i = 0; i < str.length(); i++) {
				sb.append(str.charAt(i) + " ");
			}
			return sb;
		};
		StringBuffer str2 = obj.s("Rajesh");
		System.out.println(str2);
	}
}
