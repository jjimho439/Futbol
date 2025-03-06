package equipo.jugadores.centrocampista;

import equipo.jugadores.Jugador;

abstract class Centrocampista extends Jugador {
	private int pasesCompletados;


	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}

	public Centrocampista(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		this.pasesCompletados = pasesCompletados;
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println("Posición: Centrocampista "+super.toString() + ",Pases completados: " + pasesCompletados);
		}

	

	
	

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boolean iguales = false;
		Centrocampista other = (Centrocampista) obj;
		if (super.equals(other) && this.pasesCompletados == other.pasesCompletados) {
			iguales = true;
		}
		return iguales;
	}
	
	
}
