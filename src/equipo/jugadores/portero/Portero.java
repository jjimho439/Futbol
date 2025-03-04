package equipo.jugadores.portero;

import equipo.jugadores.Jugador;

abstract class Portero extends Jugador{
	
	
	private int paradas;

	public Portero(String nombre, int dorsal, String equipo, int paradas) {
		super(nombre, dorsal, equipo);
		this.paradas = paradas;
	}

	public int getParadas() {
		return paradas;
	}

	public void setParadas(int paradas) {
		this.paradas = paradas;
	}

	@Override
<<<<<<< HEAD
	public void mostrarDatos() {
		System.out.println(super.toString() + ", Paradas: " + this.paradas);

}
	
	
=======
	public String toString() {
		return super.toString() + ", Paradas: "+paradas;
>>>>>>> ebb451da9c788972bb5020f2c0d9e320e25bfd7e
		
	}
	

}
