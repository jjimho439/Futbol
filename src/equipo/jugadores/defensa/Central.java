package equipo.jugadores.defensa;

import java.util.Objects;

public class Central extends Defensa{
	
	
	private int entradas;
	
	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.entradas = entradas;
	}

	public int getEntradas() {
		return entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}

	
	@Override
	public void mostrarDatos() {
		System.out.println(super.toString() + ", Entradas : " + this.entradas);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Central other = (Central) obj;
		return entradas == other.entradas;
	}
	

	
}
