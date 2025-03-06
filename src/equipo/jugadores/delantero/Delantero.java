package equipo.jugadores.delantero;

import java.util.Objects;

import equipo.jugadores.Jugador;

abstract class Delantero extends Jugador {
	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}

//	@Override
//	public String toString() {
//		return super.toString() + ", Goles: " + goles;
//	}
//
//	
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!super.equals(obj))
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Delantero other = (Delantero) obj;
//		return goles == other.goles;
//	}
	
	
	
}