package Interfacee;

public abstract class  Onibusabs extends Veiculosabs {
	
	@Override
	public void acelerar() {
	System.out.println("acelerando");
}
	@Override
	public void frear() {
	System.out.println("freiando");
}
	@Override
	public void virar() {
	System.out.println("virado");
}
	@Override
	public void ligar() {
	System.out.println("ligando"); 
}
}
