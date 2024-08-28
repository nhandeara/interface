package Interfacee;

public class Lobo implements Animal {
	
	@Override
	public void dormir() {
		System.out.println("dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("caminhando");
	}
	@Override
	public void correr() {
		System.out.println("correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("uivandooooooo");
	
}
}
