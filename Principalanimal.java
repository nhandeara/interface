package Interfacee;

public class Principalanimal {

	public static void main(String[] args) {
		Lobo2 lobo2 = new Lobo2();
		Leao leao= new Leao();
		Gato gato = new Gato();
		Tigre tigre= new Tigre();
		Cachorro cachorro= new Cachorro();
				
		lobo2.setNome("preto");
		lobo2.setSexo("femea");
		lobo2.setRaca("xxxxxx");
		
		leao.setNome("simba");
		leao.setSexo("femea");
		leao.setRaca("xxxxxx");
		
		gato.setNome("tutu");
		gato.setSexo("femea");
		gato.setRaca("xxxxxx");
		
		tigre.setNome("aly");
		tigre.setSexo("femea");
		tigre.setRaca("xxxxxx");
		
		cachorro.setNome("billy");
		cachorro.setSexo("femea");
		cachorro.setRaca("xxxxxx");
		
		System.out.println("----Lobo2----");
		System.out.println(lobo2.getNome());
		System.out.println(lobo2.getSexo());
		System.out.println(lobo2.getraca());
		lobo2.dormir();
		lobo2.caminhar();
		lobo2. correr();
		lobo2. emitirSom();

		System.out.println("----Leao----");
		System.out.println(leao.getNome());
		System.out.println(leao.getSexo());
		System.out.println(leao.getraca());
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
		System.out.println("----gato----");
		System.out.println(gato.getNome());
		System.out.println(gato.getSexo());
		System.out.println(gato.getraca());
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
		
		System.out.println("----tigre----");
		System.out.println(tigre.getNome());
		System.out.println(tigre.getSexo());
		System.out.println(tigre.getraca());
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		
		System.out.println("----cachorro----");
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getSexo());
		System.out.println(cachorro.getraca());
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
		
	}
}
