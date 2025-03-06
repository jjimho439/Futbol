package equipo.jugadores.portero;

import equipo.jugadores.Jugador;

public class Portero extends Jugador {

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

	public void mostrarDatos() {
		
		System.out.println("Posición: Portero "+super.toString() + ", Paradas: " + this.paradas);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Boolean iguales = false;
		Portero other = (Portero) obj;
		if (super.equals(other) && this.paradas == other.paradas) {
			iguales = true;
		}
		return iguales;
	}

}
