package equipo.jugadores.delantero;

public class DelanteroCentro extends Delantero {
	private int golesDePenalti;

	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesDePenalti = golesDePenalti;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(super.toString() + ", Posición: Delantero Centro, Goles de Penalti: " + golesDePenalti);
	}
}