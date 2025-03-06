package equipo.jugadores.defensa;

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
		if (getClass() != obj.getClass())
			return false;
		Boolean iguales = false;
		Lateral other = (Lateral) obj;
		if (super.equals(other) && this.getDisputasRealizadas() == other.getDisputasRealizadas()&& this.puesto == other.puesto) {
			iguales = true;
		}
		return iguales;
	}

}
