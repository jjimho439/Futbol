import java.util.Scanner;

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

		try {
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
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		int opcion;
		int opcion2;
		int opcion3;

		do {
			System.out.println("\n--- Menú de  Jugadores ---");
			System.out.println("1. Crear Jugadores");
			System.out.println("2. Muestrar la alineación");
			System.out.println("3. Mostrar estadísticas específicas");
			System.out.println("4. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();

			try {

				switch (opcion) {
				case 1:
					for (int i = 0; i < 11; i++) {
						System.out.println(
								"\nIngrese el tipo de jugador (Portero, Lateral, Central, Pivote, Mediapunta, Extremo, DelanteroCentro): ");
						String tipo = sc.next();
						System.out.println("Ingrese el nombre del jugador: ");
						String nombre = sc.next();
						System.out.println("Ingrese el dorsal del jugador: ");
						int dorsal = sc.nextInt();
						System.out.println("Ingrese el equipo del jugador: ");
						String equipoNombre = sc.next();

						switch (tipo.toLowerCase()) {
						case "portero":
							System.out.println("Ingrese el número de paradas: ");
							int paradas = sc.nextInt();
							equipo.añadirJugador(new Portero(nombre, dorsal, equipoNombre, paradas), i);
							break;
						case "lateral":
							System.out.println("Ingrese el puesto (izquierdo/derecho): ");
							String puestoLateral = sc.next();
							System.out.println("Ingrese el número de disputas realizadas: ");
							int disputasLateral = sc.nextInt();
							equipo.añadirJugador(
									new Lateral(nombre, dorsal, equipoNombre, disputasLateral, puestoLateral), i);
							break;
						case "central":
							System.out.println("Ingrese el número de disputas realizadas: ");
							int disputasCentral = sc.nextInt();
							System.out.println("Ingrese el número de entradas: ");
							int entradas = sc.nextInt();
							equipo.añadirJugador(new Central(nombre, dorsal, equipoNombre, disputasCentral, entradas),
									i);
							break;
						case "pivote":
							System.out.println("Ingrese el número de pases completados: ");
							int pasesPivote = sc.nextInt();
							System.out.println("Ingrese el número de intercepciones: ");
							int intercepciones = sc.nextInt();
							equipo.añadirJugador(new Pivote(nombre, dorsal, equipoNombre, pasesPivote, intercepciones),
									i);
							break;
						case "mediapunta":
							System.out.println("Ingrese el número de pases completados: ");
							int pasesMediapunta = sc.nextInt();
							System.out.println("Ingrese el número de asistencias: ");
							int asistencias = sc.nextInt();
							equipo.añadirJugador(
									new Mediapunta(nombre, dorsal, equipoNombre, pasesMediapunta, asistencias), i);
							break;
						case "extremo":
							System.out.println("Ingrese el puesto (izquierdo/derecho): ");
							String puestoExtremo = sc.next();
							System.out.println("Ingrese el número de goles: ");
							int golesExtremo = sc.nextInt();
							equipo.añadirJugador(new Extremo(nombre, dorsal, equipoNombre, golesExtremo, puestoExtremo),
									i);
							break;
						case "delanterocentro":
							System.out.println("Ingrese el número de goles: ");
							int golesDelantero = sc.nextInt();
							System.out.println("Ingrese el número de goles de penalti: ");
							int golesDePenalti = sc.nextInt();
							equipo.añadirJugador(
									new DelanteroCentro(nombre, dorsal, equipoNombre, golesDelantero, golesDePenalti),
									i);
							break;
						default:
							System.out.println("Tipo de jugador no válido.");
							i--;
							break;
						}
					}
					break;
				case 2:
					System.out.println("\n------------ALINEACIÓN------------");
					equipo.mostrarAlineacion();
					break;
				case 3:
					System.out.println("\n-----------ESTADÍSTICAS ESPECÍFICAS-----------");
					System.out.println("\n1. Ver esdísticas de todos los jugadores\n" + "2. Ver estadísticas de un jugador");
					opcion = sc.nextInt();
					if (opcion == 1) {
						for (Jugador j : equipo.getJugadores()) {
							j.mostrarDatos();
						}
					} else {
						System.out.println("Indica que jugador quieres consultar:\n"
								+ "0:	Portero.\n"
								+ "1:	Lateral izquierdo.\n"
								+ "2-3.	Centrales.\n"
								+ "4.	Lateral derecho.\n"
								+ "5-6.	Pivotes.\n"
								+ "7.	Mediapunta.\n"
								+ "8.	Extremo izquierdo.\n"
								+ "9.	Extremo derecho.\n"
								+ "10.	Delantero centro.\n");
						opcion3 = sc.nextInt();
						equipo.getJugador(opcion3).mostrarDatos();
						break;
					}
				case 4:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción no válida. Intenta de nuevo.");
				}
			} catch (Exception ew) {
				ew.printStackTrace();
			}
		} while (opcion != 4);

	}

}
