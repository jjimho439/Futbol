package equipo.jugadores.delantero;

import java.util.Objects;

public class DelanteroCentro extends Delantero {
	private int golesDePenalti;

	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesDePenalti = golesDePenalti;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(super.toString() + ", Posici�n: Delantero Centro, Goles de Penalti: " + golesDePenalti);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DelanteroCentro other = (DelanteroCentro) obj;
		return golesDePenalti == other.golesDePenalti;
	}
	
	
}