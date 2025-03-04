package equipo.jugadores.centrocampista;

import equipo.jugadores.Jugador;

abstract class Centrocampista extends Jugador {
	private int pasesCompletados;

	public Centrocampista(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		this.pasesCompletados = pasesCompletados;
	}

	@Override
	public String toString() {
		return super.toString() + ", Pases Completados: " + pasesCompletados;
	}
}
