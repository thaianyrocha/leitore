package entites;

public class letter {

	private char posicao1; 
	private char posicao2;
	private char posicao3;
	
	public letter(char posicao1, char posicao2, char posicao3) {
		super();
		this.posicao1 = posicao1;
		this.posicao2 = posicao2;
		this.posicao3 = posicao3;
	}
	
	public String processo() {
		
		if(posicao1 == 'a') {
			if(posicao2 == 'n' || posicao2 == 'g' || posicao2 == 'l' || posicao2 == 'm') {
				if('a' == posicao3 || 'e' == posicao3 || 'i' == posicao3 || 'o' == posicao3 || 'u' == posicao3) {
					
						return "\n **NOME** \n";
					
				}
				return "\n **NOME** \n";
			}
			if(posicao1 == 'a' && posicao2 == 'b' || posicao1 == 'a' && posicao2 == 'g' || posicao1 == 'a' && posicao2 == 'r') {
				if(posicao2 == 'n' || posicao2 == 'g' || posicao2 == 'l' || posicao2 == 'm') {
					if('a' == posicao3 || 'e' == posicao3 || 'i' == posicao3 || 'o' == posicao3 || 'u' == posicao3) {
						
							return "\n **OBJETO** \n";
						
					}
					return "\n **OBJETO** \n";
				}
				return "\n **OBJETO** \n"; 
			}
		}
		if(posicao1 == 'e') {
			if(posicao2 == 'n' || posicao2 == 'g' || posicao2 == 'l' || posicao2 == 'm') {
				if('a' == posicao3 || 'e' == posicao3 || 'i' == posicao3 || 'o' == posicao3 || 'u' == posicao3) {
					
						return "\n **NOME** \n";
					
				}
				return "\n **NOME** \n";
			}

			if(posicao1 == 'e' && posicao2 == 'b' || posicao1 == 'e' && posicao2 == 'g' || posicao1 == 'e' && posicao2 == 'r') {
				if(posicao2 == 'n' || posicao2 == 'g' || posicao2 == 'l' || posicao2 == 'm') {
					if('a' == posicao3 || 'e' == posicao3 || 'i' == posicao3 || 'o' == posicao3 || 'u' == posicao3) {
						
							return "\n **OBJETO** \n";
						
					}
					return "\n **OBJETO** \n";
				}
				return "\n **OBJETO** \n"; 
			} 
		}
		if(posicao1 == 'i') {
			if(posicao2 == 'n' || posicao2 == 'g' || posicao2 == 'l' || posicao2 == 'm') {
				if('a' == posicao3 || 'e' == posicao3 || 'i' == posicao3 || 'o' == posicao3 || 'u' == posicao3) {
					
						return "\n **NOME** \n";
					
				}
				return "\n **NOME** \n";
			}

			if(posicao1 == 'i' && posicao2 == 'b' || posicao1 == 'i' && posicao2 == 'g' || posicao1 == 'i' && posicao2 == 'r') {
				if(posicao2 == 'n' || posicao2 == 'g' || posicao2 == 'l' || posicao2 == 'm') {
					if('a' == posicao3 || 'e' == posicao3 || 'i' == posicao3 || 'o' == posicao3 || 'u' == posicao3) {
						
							return "\n **OBJETO** \n";
						
					}
					return "\n **OBJETO** \n";
				}
				return "\n **OBJETO** \n"; 
			} 
		}
		if(posicao1 == 'o') {
			if(posicao2 == 'n' || posicao2 == 'g' || posicao2 == 'l' || posicao2 == 'm') {
				if('a' == posicao3 || 'e' == posicao3 || 'i' == posicao3 || 'o' == posicao3 || 'u' == posicao3) {
					
						return "\n **NOME** \n";
					
				}
				return "\n **NOME** \n";
			}

			if(posicao1 == 'o' && posicao2 == 'b' || posicao1 == 'o' && posicao2 == 'g' || posicao1 == 'o' && posicao2 == 'r') {
				if(posicao2 == 'n' || posicao2 == 'g' || posicao2 == 'l' || posicao2 == 'm') {
					if('a' == posicao3 || 'e' == posicao3 || 'i' == posicao3 || 'o' == posicao3 || 'u' == posicao3) {
						
							return "\n **OBJETO** \n";
						
					}
					return "\n **OBJETO** \n";
				}
				return "\n **OBJETO** \n"; 
			}
		}
		if(posicao1 == 'u') {
			if(posicao2 == 'n' || posicao2 == 'g' || posicao2 == 'l' || posicao2 == 'm') {
				if('a' == posicao3 || 'e' == posicao3 || 'i' == posicao3 || 'o' == posicao3 || 'u' == posicao3) {
					
						return "\n **NOME** \n";
					
				}
				return "\n **NOME** \n";
			}

			if(posicao1 == 'u' && posicao2 == 'b' || posicao1 == 'u' && posicao2 == 'g' || posicao1 == 'u' && posicao2 == 'r') {
				if(posicao2 == 'n' || posicao2 == 'g' || posicao2 == 'l' || posicao2 == 'm') {
					if('a' == posicao3 || 'e' == posicao3 || 'i' == posicao3 || 'o' == posicao3 || 'u' == posicao3) {
						
							return "\n **OBJETO** \n";
						
					}
					return "\n **OBJETO** \n";
				}
				return "\n **OBJETO** \n"; 
			} 
		}
		
		
		return "\n **NAO IDENTIFICADO** \n";
			
	}
	
}
