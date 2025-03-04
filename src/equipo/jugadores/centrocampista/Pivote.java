package equipo.jugadores.centrocampista;

public class Pivote extends Centrocampista {
	private int intercepciones;

	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.intercepciones = intercepciones;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(super.toString() + ", Posición: Pivote, Intercepciones: " + intercepciones);
	}
}
