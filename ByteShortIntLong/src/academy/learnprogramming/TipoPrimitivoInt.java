package academy.learnprogramming;

public class TipoPrimitivoInt {
	public static void main(String[] args) {
		// Tipos Primitivos
		
		int myValue = 2147483647;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println("Integer valor mínimo " + myMinIntValue);
		System.out.println("Integer valor máximo " + myMaxIntValue);
		
		// se fizer uma sentença dentro da string, sempre usar o (), veja a diferença das linhas abaixo na sysout
		System.out.println("Estourar o valor máximo " + myMaxIntValue + 1);
		
		// quando estoura o valor máximo ele inicia do mínimo
		System.out.println("Estourar o valor máximo " + (myMaxIntValue + 1));
		// quando estoura o valor mínmo ele fica positivo. 
		System.out.println("Estourar o valor mínimo " + (myMinIntValue - 1));
		
		//Chamamos essa duas situações de Overflow
		
	}
}
