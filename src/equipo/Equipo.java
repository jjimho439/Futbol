package equipo;

import equipo.jugadores.Jugador;

public class Equipo {
	private Jugador[] jugadores;

	public Equipo() {
		this.jugadores = new Jugador[11];
	}

	public void añadirJugador(Jugador jugador, int posicion) {
		if (posicion < 0 || posicion >= 11) {
			throw new IndexOutOfBoundsException("Posición inválida");
		}
		jugadores[posicion] = jugador;
	}

	public void mostrarAlineacion() {
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i] == null) {
				throw new IllegalStateException("No se han cubierto todos los puestos");
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