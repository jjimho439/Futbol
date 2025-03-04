package equipo.jugadores.centrocampista;

public class Mediapunta extends Centrocampista {
	private int asistencias;

	public Mediapunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.asistencias = asistencias;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(super.toString() + ", Posición: Mediapunta, Asistencias: " + asistencias);
	}
}