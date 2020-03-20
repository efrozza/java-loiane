
public class Main {

	public static void main(String[] args) {
		
		// float ocupa 32 bytes e double ocupa 64bits
		
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		
		System.out.println("Float minimum value " + myMinFloatValue);
		System.out.println("Float maximum value " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		
		System.out.println("double minimum value " + myMinDoubleValue);
		System.out.println("double maximum value " + myMaxDoubleValue);
		
		int myIntValue = 5;
		
		// por default o Java vai entender uma valorização como 5.25 como double
		// para atribuir esse valor a um float precisamos incluir a letra f
		float myFloatValue = 5.25f;
		
		// podemos também fazer cast quando necessário
		
		float myFloatDouble = (float) 5.25;
		
		System.out.println("Divisões");
		
		
		int myIntValue2 = 5 / 2; 
		float myFloatValue2 = 5f / 2f;
		
		double myDoubleValue2 = 5d / 3d;
		
		// a linha abaixo também dara o mesmo resultado da linha acima
		//double myDoubleValue2 = 5.00 / 3.00;

//		se fizermos conforme abaixo as divisões não vao considerar a casa deciamal, porque o java entendende como operações entre inteiros
//		int myIntValue2 = 5 / 2; 
//		float myFloatValue2 = 5 / 2;
//		double myDoubleValue2 = 5 / 2;

		System.out.println(myIntValue2 + " " + myFloatValue2 + " " + myDoubleValue2);

	}

}
