package equipo.jugadores.delantero;

import java.util.Objects;

public class Extremo extends Delantero {
	private String puesto;

	public Extremo(String nombre, int dorsal, String equipo, int goles, String puesto) {
		super(nombre, dorsal, equipo, goles);
		this.puesto = puesto;
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println("Posición: Extremo "+super.toString() + ", Puesto : " + this.puesto);
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Extremo other = (Extremo) obj;
		return Objects.equals(puesto, other.puesto);
	}
	
	
}