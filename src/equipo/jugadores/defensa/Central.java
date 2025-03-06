package equipo.jugadores.defensa;

public class Central extends Defensa {

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
		
		System.out.println("Posición: Central "+super.toString() + ", Entradas: " + this.entradas);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boolean iguales = false;
		Central other = (Central) obj;
		if (super.equals(other) && this.getDisputasRealizadas() == other.getDisputasRealizadas()&& this.entradas == other.entradas) {
			iguales = true;
		}
		return iguales;
	}

}
