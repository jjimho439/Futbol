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
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mediapunta other = (Mediapunta) obj;
		return asistencias == other.asistencias;
	}
	
	
}