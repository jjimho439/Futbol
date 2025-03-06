package equipo.jugadores.defensa;

import java.util.Objects;

public class Lateral extends Defensa {

	String puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.puesto = puesto;

	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println("Posición: Lateral "+super.toString() + ", Puesto: " + this.puesto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lateral other = (Lateral) obj;
		return Objects.equals(puesto, other.puesto);
	}

}
