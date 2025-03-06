import equipo.Equipo;
import equipo.jugadores.Jugador;
import equipo.jugadores.centrocampista.Mediapunta;
import equipo.jugadores.centrocampista.Pivote;
import equipo.jugadores.defensa.Central;
import equipo.jugadores.defensa.Lateral;
import equipo.jugadores.delantero.DelanteroCentro;
import equipo.jugadores.delantero.Extremo;
import equipo.jugadores.portero.Portero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   Equipo equipo = new Equipo();

           // Crear 11 jugadores
           equipo.a�adirJugador(new Portero("Iker Casillas", 1, "Real Madrid", 50), 0);
           equipo.a�adirJugador(new Lateral("Marcelo", 12, "Real Madrid", 30, "Izquierdo"), 1);
           equipo.a�adirJugador(new Central("Sergio Ramos", 4, "Real Madrid", 40, 20), 2);
           equipo.a�adirJugador(new Central("Pepe", 3, "Real Madrid", 35, 18), 3);
           equipo.a�adirJugador(new Lateral("Carvajal", 2, "Real Madrid", 25, "Derecho"), 4);
           equipo.a�adirJugador(new Pivote("Casemiro", 14, "Real Madrid", 50, 30), 5);
           equipo.a�adirJugador(new Pivote("Kroos", 8, "Real Madrid", 70, 10), 6);
           equipo.a�adirJugador(new Mediapunta("Modric", 10, "Real Madrid", 80, 25), 7);
           equipo.a�adirJugador(new Extremo("Vinicius Jr.", 20, "Real Madrid", 15, "Izquierdo"), 8);
           equipo.a�adirJugador(new Extremo("Rodrygo", 11, "Real Madrid", 12, "Derecho"), 9);
           equipo.a�adirJugador(new DelanteroCentro("Benzema", 9, "Real Madrid", 25, 8), 10);
           equipo.a�adirJugador(new Portero("Iker Casillas", 1, "Real Madrid", 50), 0);
           
         
           
        

           equipo.mostrarAlineacion();
           
         for (Jugador j : equipo.getJugadores()) {
        	 j.mostrarDatos();
         }
           
           
           System.out.println("Comparando portero1 con portero2:");
          if ( equipo.equals(equipo)) {
        	  System.out.println("El jugador est� repetido");
          }else {
        	  System.out.println("No hay jugadores repetidos");
          } 
           
           
          
	
}
				
	}


