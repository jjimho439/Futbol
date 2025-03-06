package equipo.jugadores.centrocampista;

import java.util.Objects;

import equipo.jugadores.Jugador;

abstract class Centrocampista extends Jugador {
	private int pasesCompletados;

	public Centrocampista(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		this.pasesCompletados = pasesCompletados;
	}

//	@Override
//	public String toString() {
//		return super.toString() + ", Pases Completados: " + pasesCompletados;
//	}
//
//	
//	
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		
//		if (!super.equals(obj))
//			return false;
//		
//		if (getClass() != obj.getClass())
//			return false;
//		
//		Centrocampista other = (Centrocampista) obj;
//		return pasesCompletados == other.pasesCompletados;
//	}
	
	
}
