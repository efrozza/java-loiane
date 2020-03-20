
public class TestaCarro {
	
	public static void main(String[] args) {
		Carro carro = new Carro ();
		carro.setMarca("Honda");
		carro.setModelo("Civic");
		
		System.out.println("Marca: " + carro.getMarca());
		System.out.println("Modelo " + carro.getModelo());
		System.out.println(carro.ligar());
		
		CarroEsportivo carroEsportivo = new CarroEsportivo();
		carroEsportivo.setMarca("Ferrari");
		carroEsportivo.setModeloTurbina("v32");
		
		System.out.println("a le eh muito gata");
	}

}
