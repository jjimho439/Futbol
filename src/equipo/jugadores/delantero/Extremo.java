package equipo.jugadores.delantero;

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
		if (getClass() != obj.getClass())
			return false;
		Boolean iguales = false;
		Extremo other = (Extremo) obj;
		if (super.equals(other) && this.getGoles() == other.getGoles()&& this.puesto == other.puesto) {
			iguales = true;
		}
		return iguales;
	}
	
	
}