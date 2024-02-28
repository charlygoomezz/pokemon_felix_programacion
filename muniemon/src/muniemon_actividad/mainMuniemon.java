package muniemon_actividad;

import java.util.Scanner;

public class mainMuniemon {

	public static void main(String[] args) {
		System.out.println("-------------------BIENVENIDO A MUNIEMON-------------------");
		Scanner sc = new Scanner(System.in);
		Muniemon mu = new Muniemon();
		int opcion = 0;
		do{
			menu();
			opcion = sc.nextInt();
			switch (opcion) {
            case 1:
                System.out.println("Introduce los datos del Muniemon:");
                sc.nextLine(); 
                System.out.print("Nombre: ");
                mu.setNombre(sc.next());
                System.out.print("Vida: ");
                mu.setVida(sc.nextInt());
                System.out.print("Ataque: ");
                mu.setAtaque(sc.nextInt());
                System.out.print("Defensa: ");
                mu.setDefensa(sc.nextInt());
                System.out.print("Tipo (AGUA, TIERRA, FUEGO, PLANTA): ");
                mu.setTipo (Tipo.valueOf(sc.next().toUpperCase()));

                
                System.out.println("Muniemon creado con éxito.");
                break;
            case 2:
                if (mu != null) {
                    System.out.println("---Datos del Muniemon---");
                    System.out.println("Nombre: " + mu.getNombre());
                    System.out.println("Vida: " + mu.getVida());
                    System.out.println("Ataque: " + mu.getAtaque());
                    System.out.println("Defensa: " + mu.getDefensa());
                    System.out.println("Tipo: " + mu.getTipo());
                } else {
                    System.out.println("No hay ningún Muniemon creado.");
                }
                break;
            case 3:
                System.out.println("Saliste del programa");
                break;
            default:
                System.out.println("Opción no válida.");
			
			}
			}while(opcion !=3);
	

		
	}
	public static void menu() {
		System.out.println("--------------------------------------");
		System.out.println("Pulse 1. para dar de alta un Muniemon");
		System.out.println("Pulse 2. para mostra un Muniemon");
		System.out.println("Pulse 3. para salir del programa");
		System.out.println("--------------------------------------");
	}
	
}
