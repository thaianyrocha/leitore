package entites;

import java.util.Scanner;

public class keyboard {
	
	public int lerInt(String metodo) { 
		System.out.println(metodo);
		@SuppressWarnings("resource")
		Scanner am = new Scanner(System.in);
		return am.nextInt();
	}
	
	public String lerString(String metodo) {
		System.out.println(metodo);
		@SuppressWarnings("resource")
		Scanner am = new Scanner(System.in);
		return am.nextLine();
		
	}
	
	public char lerChar(String metodo) {
		System.out.println(metodo);
		@SuppressWarnings("resource")
		Scanner am = new Scanner(System.in);
		return am.nextLine().charAt(0);		
	}
}
