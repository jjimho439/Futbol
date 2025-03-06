package equipo.jugadores.delantero;

import equipo.jugadores.Jugador;

abstract class Delantero extends Jugador {
	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println("Posición: Delantero "+super.toString() + ", Goles: " + this.goles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Boolean iguales = false;
		Delantero other = (Delantero) obj;
		if (super.equals(other) && this.goles == other.goles) {
			iguales = true;
		}
		return iguales;
	}

}