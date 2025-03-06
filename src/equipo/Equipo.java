package equipo;

import equipo.jugadores.Jugador;

public class Equipo {
	private Jugador[] jugadores;

	public Equipo() {
		this.jugadores = new Jugador[11];
	}

	public void añadirJugador(Jugador jugador, int posicion) {
		if (posicion < 0 || posicion >11) {
			throw new IndexOutOfBoundsException("Posición inválida");
		}
		if(jugador.equals(jugadores[posicion])) {
			throw new IllegalArgumentException("Jugador Duplicado");
		}
		jugadores[posicion] = jugador;
	}

	public void mostrarAlineacion() {
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i] == null) {
				System.out.println("El jugador " +i+ " está vacío");
			}
			System.out.println((i+1) + ": " + jugadores[i].toString());
		}
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}
	public Jugador getJugador(int i) {
		return jugadores[i];
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
}