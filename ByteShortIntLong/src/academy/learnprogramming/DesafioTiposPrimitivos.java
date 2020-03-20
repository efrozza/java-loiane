package academy.learnprogramming;

public class DesafioTiposPrimitivos {

	public static void main(String[] args) {

		byte varByte 	= 10;
		short varShort 	= 20;
		int varInt 		= 50;
		long varLong 	= 50000L + (10 * (varByte + varShort + varInt));

		System.out.println("valor do long " + varLong);

		// como temos uma variavel int que � maior que um short o java da erro, ent�o temos que fazer cast do resultado final para short
		// se tentarmos a linha abaixo daria erro
		// short shortTotal =  (1000 + 10 * (varByte + varShort + (short) varInt));
		short shortTotal = (short) (1000 + 10 * (varByte + varShort + varInt));
		
		System.out.println(shortTotal);
		
	}

}
