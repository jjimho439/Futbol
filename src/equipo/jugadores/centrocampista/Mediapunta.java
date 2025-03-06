package equipo.jugadores.centrocampista;

public class Mediapunta extends Centrocampista {
	private int asistencias;

	public Mediapunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.asistencias = asistencias;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Posición: Mediapunta "+super.toString() + ", Asistencias: " + asistencias);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boolean iguales = false;
		Mediapunta other = (Mediapunta) obj;
		if (super.equals(other) && this.getPasesCompletados() == other.getPasesCompletados() &&this.asistencias == other.asistencias) {
			iguales = true;
		}
		return iguales;
	}

	
	
}