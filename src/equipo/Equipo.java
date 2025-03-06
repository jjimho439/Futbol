package equipo;

import equipo.jugadores.Jugador;

public class Equipo {
	private Jugador[] jugadores;

	public Equipo() {
		this.jugadores = new Jugador[12];
	}

	public void a�adirJugador(Jugador jugador, int posicion) {
		if (posicion < 1 || posicion >12) {
			throw new IndexOutOfBoundsException("Posici�n inv�lida");
		}
		jugadores[posicion] = jugador;
	}

	public void mostrarAlineacion() {
		for (int i = 1; i < jugadores.length; i++) {
			if (jugadores[i] == null) {
				throw new IllegalStateException("El jugador " +i+ " est� vac�o");
			}
			System.out.println(i + ": " + jugadores[i].toString());
		}
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
}