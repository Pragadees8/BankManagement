package org.demo;

public class Hello {
	private void add() {
		int a=10;
		System.out.println("a in method:"+a);
	}
	public static void main(String[] args) {
		String a="Neymar";
		String a1="messi";
		System.out.println("a in method:"+a);
		System.out.println("a in method:"+a1);
		 Hello h =new Hello();
		 h.add();
		 h.add();
	}
	

}
