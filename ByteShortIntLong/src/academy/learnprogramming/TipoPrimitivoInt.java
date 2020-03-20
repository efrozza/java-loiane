package academy.learnprogramming;

public class TipoPrimitivoInt {
	public static void main(String[] args) {
		// Tipos Primitivos
		
		int myValue = 2147483647;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println("Integer valor m�nimo " + myMinIntValue);
		System.out.println("Integer valor m�ximo " + myMaxIntValue);
		
		// se fizer uma senten�a dentro da string, sempre usar o (), veja a diferen�a das linhas abaixo na sysout
		System.out.println("Estourar o valor m�ximo " + myMaxIntValue + 1);
		
		// quando estoura o valor m�ximo ele inicia do m�nimo
		System.out.println("Estourar o valor m�ximo " + (myMaxIntValue + 1));
		// quando estoura o valor m�nmo ele fica positivo. 
		System.out.println("Estourar o valor m�nimo " + (myMinIntValue - 1));
		
		//Chamamos essa duas situa��es de Overflow
		
	}
}
