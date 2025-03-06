import java.util.Scanner;

import equipo.Equipo;
import equipo.jugadores.centrocampista.Mediapunta;
import equipo.jugadores.centrocampista.Pivote;
import equipo.jugadores.defensa.Central;
import equipo.jugadores.defensa.Lateral;
import equipo.jugadores.delantero.DelanteroCentro;
import equipo.jugadores.delantero.Extremo;
import equipo.jugadores.portero.Portero;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Equipo equipo = new Equipo();
        
        System.out.println("Creación de un equipo de fútbol");
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el tipo de jugador (Portero, Lateral, Central, Pivote, Mediapunta, Extremo, DelanteroCentro): ");
            String tipo = scanner.nextLine();
            System.out.println("Ingrese el nombre del jugador: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el dorsal del jugador: ");
            int dorsal = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese el equipo del jugador: ");
            String equipoNombre = scanner.nextLine();

            switch (tipo.toLowerCase()) {
                case "portero":
                    System.out.println("Ingrese el número de paradas: ");
                    int paradas = Integer.parseInt(scanner.nextLine());
                    equipo.añadirJugador(new Portero(nombre, dorsal, equipoNombre, paradas), i);
                    break;
                case "lateral":
                    System.out.println("Ingrese el puesto (izquierdo/derecho): ");
                    String puestoLateral = scanner.nextLine();
                    System.out.println("Ingrese el número de disputas realizadas: ");
                    int disputasLateral = Integer.parseInt(scanner.nextLine());
                    equipo.añadirJugador(new Lateral(nombre, dorsal, equipoNombre, disputasLateral, puestoLateral), i);
                    break;
                case "central":
                    System.out.println("Ingrese el número de disputas realizadas: ");
                    int disputasCentral = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el número de entradas: ");
                    int entradas = Integer.parseInt(scanner.nextLine());
                    equipo.añadirJugador(new Central(nombre, dorsal, equipoNombre, disputasCentral, entradas), i);
                    break;
                case "pivote":
                    System.out.println("Ingrese el número de pases completados: ");
                    int pasesPivote = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el número de intercepciones: ");
                    int intercepciones = Integer.parseInt(scanner.nextLine());
                    equipo.añadirJugador(new Pivote(nombre, dorsal, equipoNombre, pasesPivote, intercepciones), i);
                    break;
                case "mediapunta":
                    System.out.println("Ingrese el número de pases completados: ");
                    int pasesMediapunta = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el número de asistencias: ");
                    int asistencias = Integer.parseInt(scanner.nextLine());
                    equipo.añadirJugador(new Mediapunta(nombre, dorsal, equipoNombre, pasesMediapunta, asistencias), i);
                    break;
                case "extremo":
                    System.out.println("Ingrese el puesto (izquierdo/derecho): ");
                    String puestoExtremo = scanner.nextLine();
                    System.out.println("Ingrese el número de goles: ");
                    int golesExtremo = Integer.parseInt(scanner.nextLine());
                    equipo.añadirJugador(new Extremo(nombre, dorsal, equipoNombre, golesExtremo, puestoExtremo), i);
                    break;
                case "delanterocentro":
                    System.out.println("Ingrese el número de goles: ");
                    int golesDelantero = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese el número de goles de penalti: ");
                    int golesDePenalti = Integer.parseInt(scanner.nextLine());
                    equipo.añadirJugador(new DelanteroCentro(nombre, dorsal, equipoNombre, golesDelantero, golesDePenalti), i);
                    break;
                default:
                    System.out.println("Tipo de jugador no válido.");
                    i--;
                    break;
            }
        }

        if (equipo != null) {
            equipo.mostrarAlineacion();
        }

        scanner.close();
    }
}