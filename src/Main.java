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
           equipo.añadirJugador(new Portero("Iker Casillas", 1, "Real Madrid", 50), 0);
           equipo.añadirJugador(new Lateral("Marcelo", 12, "Real Madrid", 30, "Izquierdo"), 1);
           equipo.añadirJugador(new Central("Sergio Ramos", 4, "Real Madrid", 40, 20), 2);
           equipo.añadirJugador(new Central("Pepe", 3, "Real Madrid", 35, 18), 3);
           equipo.añadirJugador(new Lateral("Carvajal", 2, "Real Madrid", 25, "Derecho"), 4);
           equipo.añadirJugador(new Pivote("Casemiro", 14, "Real Madrid", 50, 30), 5);
           equipo.añadirJugador(new Pivote("Kroos", 8, "Real Madrid", 70, 10), 6);
           equipo.añadirJugador(new Mediapunta("Modric", 10, "Real Madrid", 80, 25), 7);
           equipo.añadirJugador(new Extremo("Vinicius Jr.", 20, "Real Madrid", 15, "Izquierdo"), 8);
           equipo.añadirJugador(new Extremo("Rodrygo", 11, "Real Madrid", 12, "Derecho"), 9);
           equipo.añadirJugador(new DelanteroCentro("Benzema", 9, "Real Madrid", 25, 8), 10);
           equipo.añadirJugador(new Portero("Iker Casillas", 1, "Real Madrid", 50), 0);
           
         
           
        

           equipo.mostrarAlineacion();
           
         for (Jugador j : equipo.getJugadores()) {
        	 j.mostrarDatos();
         }
           
           
           System.out.println("Comparando portero1 con portero2:");
          if ( equipo.equals(equipo)) {
        	  System.out.println("El jugador está repetido");
          }else {
        	  System.out.println("No hay jugadores repetidos");
          } 
           
           
          
	
}
				
	}


