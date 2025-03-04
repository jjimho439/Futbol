package equipo.jugadores.delantero;

public class Extremo extends Delantero {
	private String puesto;

	public Extremo(String nombre, int dorsal, String equipo, int goles, String puesto) {
		super(nombre, dorsal, equipo, goles);
		this.puesto = puesto;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(super.toString() + ", Posición: Extremo " + puesto);
	}
}