package leitore;

import entites.keyboard;
import entites.letter;

public class main {

	public static void main(String[] args) {
		letter lt = null;
		keyboard kb = new keyboard();
		while(true) {
			for(int i=0;i<5;i++) {
				
				char posicao1 = kb.lerChar("insira as 3 primeiras letras \n"
						+ "e aperte enter");
				char posicao2 = kb.lerChar(" ");
				char posicao3 = kb.lerChar(" ");
				letter arm = new letter(posicao1, posicao2, posicao3);
				lt = arm; 
				System.out.println(lt.processo());
				
			}
		}
			
		}
	}


