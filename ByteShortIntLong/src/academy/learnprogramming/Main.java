package academy.learnprogramming;

public class Main {

	public static void main(String[] args) {
		
		// Tipos Primitivos
		
		int myValue = 2147483647;
		int cpf = 52165889;
		
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
		
		// Tipo Primitivo Byte
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		
		System.out.println("Byte valor mínimo " + myMinByteValue);
		System.out.println("Byte valor máximo " + myMaxByteValue);
		
		// Tipo Primitivo short
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		
		System.out.println("Short valor mínimo " + myMinShortValue);
		System.out.println("Short valor máximo " + myMaxShortValue);
		
		// A declaração do long exige a letra L
		long myLongValue = 100L;

		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		
		System.out.println("Long valor mínimo " + myMinLongValue);
		System.out.println("Long valor máximo " + myMaxLongValue);
				
		// Byte 8 bits
		// Short 16 bits
		// Integer 32 bits
		
		int myTotal = (myMinIntValue / 2);
		
		// o resultado de expressões é tratado como int em java precisamos fazer casting
		// o indicado é sempre usarmos pelo menos int na declaração de variaveis numericas sem ponto flutuante
		
		byte myNewByte = ((byte) (myMinByteValue / 2));


	}

}
