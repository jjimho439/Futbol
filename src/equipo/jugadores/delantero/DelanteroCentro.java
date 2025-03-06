package equipo.jugadores.delantero;

public class DelanteroCentro extends Delantero {
	private int golesDePenalti;

	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesDePenalti = golesDePenalti;
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println("Posición: Delantero Centro "+super.toString() + ", Goles de Penalti: " + this.golesDePenalti);
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boolean iguales = false;
		DelanteroCentro other = (DelanteroCentro) obj;
		if (super.equals(other) && this.getGoles() == other.getGoles()&& this.golesDePenalti == other.golesDePenalti) {
			iguales = true;
		}
		return iguales;
	}
	
	
}