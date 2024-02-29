package muniemon_actividad;

import java.util.Scanner;

public class mainMuniemon {

	public static void main(String[] args) {
		System.out.println("-------------------BIENVENIDO A MUNIEMON-------------------");
		Scanner sc = new Scanner(System.in);
		Muniemon mu1 = null;
		Muniemon mu2 = null;
		int opcion = 0;
		do{
			menu();
			opcion = sc.nextInt();
			switch (opcion) {
            case 1:
            	mu1 = crearMuniemon(sc);
                break;
            case 2:
                mu2 = crearMuniemon(sc);
                break;
            case 3:
                mostrarMuniemon(mu1);
                break;
            case 4:
                mostrarMuniemon(mu2);
                break;
            case 5:
                atacarMuniemon(mu1, mu2);
                break;
            case 6:
               atacarMuniemon(mu2, mu1);
               break;
            case 7:
            	System.out.println("Saliste del programa");
            default:
                System.out.println("Opción no válida.");
			}
			}while(opcion !=8);
		
	}
	public static void menu() {
		System.out.println("--------------------------------------");
		System.out.println("Pulse 1. para dar de alta al primer Muniemon.");
		System.out.println("Pulse 2. para dar de alta al segundo Muniemon.");
		System.out.println("Pulse 3. para mostra al primer Muniemon.");
		System.out.println("Pulse 4. para mostra al segundo Muniemon.");
		System.out.println("Pulse 5. para atacar con el primer Muniemon al segundo.");
		System.out.println("Pulse 6. para atacar con el segundo Muniemon al primer.");
		System.out.println("Pulse 7. para salir del programa.");
		System.out.println("--------------------------------------");
	}
	public static Muniemon crearMuniemon(Scanner sc) {
		 	Muniemon m = new Muniemon();
		 	 System.out.println("Introduce los datos del Muniemon:");
             sc.nextLine(); 
             System.out.print("Nombre: ");
             m.setNombre(sc.next());
             System.out.print("Vida: ");
             m.setVida(sc.nextInt());
             System.out.print("Ataque: ");
             m.setAtaque(sc.nextInt());
             System.out.print("Defensa: ");
             m.setDefensa(sc.nextInt());
             System.out.print("Selecciona el tipo de tu Muniemon:\r");
             sc.nextLine();
             int posicion = 0;
             for(Tipo tp: Tipo.values()) {
             	System.out.println(posicion+"-"+tp);
             	posicion++;                	
             }
             m.setTipo(Tipo.values()[sc.nextInt()]);
             System.out.println("Muniemon creado con éxito.");
	        return m;
	    }
	public static void mostrarMuniemon(Muniemon muniemon) {
		if (muniemon != null) {
            System.out.println("---Datos del Muniemon---");
            System.out.println("Nombre: " + muniemon.getNombre());
            System.out.println("Vida: " + muniemon.getVida());
            System.out.println("Ataque: " + muniemon.getAtaque());
            System.out.println("Defensa: " + muniemon.getDefensa());
            System.out.println("Tipo: " + muniemon.getTipo());
        } else {
            System.out.println("No hay ningún Muniemon creado.");
        }
		
	}
	public static void atacarMuniemon(Muniemon muniemon1, Muniemon muniemon2) {
		 if (muniemon1 != null && muniemon2 != null) {
             muniemon1.atacar(muniemon2);
         } else {
             System.out.println("Debe crear ambos Muniemon primero.");
         }
	}
		
	
	
}
