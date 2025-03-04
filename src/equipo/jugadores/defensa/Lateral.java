package equipo.jugadores.defensa;

public class Lateral extends Defensa{
	
	String puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, String puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.puesto = puesto;
		
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
	@Override
	public void mostrarDatos() {
		System.out.println(super.toString() + ", Puesto: " + this.puesto);

}
}
