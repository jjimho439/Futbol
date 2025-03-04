import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("----Creación de equipos y jugadores----");
			System.out.println("Seleccione una opción:");
			System.out.println("1. Crear jugador");
			System.out.println("2. Mostrar alineación ");
			System.out.println("0.Salir ");
		
			opcion = sc.nextInt();

			System.out.println();
			System.out.println();

			switch (opcion) {
			case 1:
				System.out.print("Nombre del jugador: ");
                String nombre = sc.nextLine();
                System.out.print("Dorsal: ");
                int dorsal = sc.nextInt();
                sc.nextLine();
                System.out.print("Posición (Portero, Central, Lateral): ");
                String posicion = sc.nextLine();
               
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
        }
    } while (opcion != 0);

  
}
				
	}


