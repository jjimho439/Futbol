package equipo.jugadores.delantero;

import equipo.jugadores.Jugador;

abstract class Delantero extends Jugador {
	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}

	@Override
	public String toString() {
		return super.toString() + ", Goles: " + goles;
	}
}