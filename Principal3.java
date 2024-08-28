package Interfacee;

public class Principal3 {

	public static void main(String[] args) {
		Gamer gamerz = new Gamer();
		Home homes = new Home();
	
		System.out.println("Computador Gamer: ");
		gamerz.ligar();
		gamerz.desligar();
		gamerz.reiniciar();
		gamerz.carregandoSistema();
		
	     System.out.println("Computador Home: ");
		 homes.ligar();
		 homes.desligar();
		 homes.reiniciar();
		 homes.carregandoSistema();
		 }
}
		 

	
