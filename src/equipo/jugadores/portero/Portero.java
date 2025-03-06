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
		System.out.println(super.toString() + ", Paradas: " + this.paradas);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Portero other = (Portero) obj;
		return paradas == other.paradas;
	}

}
