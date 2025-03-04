package equipo.jugadores.defensa;

import equipo.jugadores.Jugador;




public  abstract class Defensa extends Jugador {
	
	private int disputasRealizadas;
	
	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}



	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}



	public Defensa(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		this.disputasRealizadas =  disputasRealizadas;
		
	}



	


	@Override
	public void mostrarDatos() {
		System.out.println(super.toString() + ", Disputas realizadas: " + this.disputasRealizadas);
	}

	

	
	
	
	
	
	
	
	

}
