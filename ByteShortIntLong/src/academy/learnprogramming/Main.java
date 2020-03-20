package academy.learnprogramming;

public class Main {

	public static void main(String[] args) {
		
		// Tipos Primitivos
		
		int myValue = 2147483647;
		int cpf = 52165889;
		
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
		
		// Tipo Primitivo Byte
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		
		System.out.println("Byte valor m�nimo " + myMinByteValue);
		System.out.println("Byte valor m�ximo " + myMaxByteValue);
		
		// Tipo Primitivo short
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		
		System.out.println("Short valor m�nimo " + myMinShortValue);
		System.out.println("Short valor m�ximo " + myMaxShortValue);
		
		// A declara��o do long exige a letra L
		long myLongValue = 100L;

		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		
		System.out.println("Long valor m�nimo " + myMinLongValue);
		System.out.println("Long valor m�ximo " + myMaxLongValue);
				
		// Byte 8 bits
		// Short 16 bits
		// Integer 32 bits
		
		int myTotal = (myMinIntValue / 2);
		
		// o resultado de express�es � tratado como int em java precisamos fazer casting
		// o indicado � sempre usarmos pelo menos int na declara��o de variaveis numericas sem ponto flutuante
		
		byte myNewByte = ((byte) (myMinByteValue / 2));


	}

}
