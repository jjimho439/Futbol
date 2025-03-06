package equipo.jugadores;

import java.util.Objects;

public abstract class Jugador {

	private String nombre;
	private int dorsal;
	private String equipo;

	public Jugador(String nombre, int dorsal, String equipo) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public abstract void mostrarDatos();

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Dorsal: " + dorsal + ", Equipo: " + equipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dorsal, equipo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Jugador other = (Jugador) obj;
		return dorsal == other.dorsal && Objects.equals(equipo, other.equipo) && Objects.equals(nombre, other.nombre);
	}


		 
	
}
