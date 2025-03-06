package equipo.jugadores.centrocampista;

public class Pivote extends Centrocampista {
	private int intercepciones;

	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.intercepciones = intercepciones;
	}

	@Override
	public void mostrarDatos() {
		
		System.out.println("Posición: Pivote "+super.toString() + ", Intercepciones: " + intercepciones);
		}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Boolean iguales = false;
		Pivote other = (Pivote) obj;
		if (super.equals(other) && this.getPasesCompletados() == other.getPasesCompletados() &&this.intercepciones == other.intercepciones) {
			iguales = true;
		}
		return iguales;
	}

}
