import java.util.Scanner;

public class Main {

	public static void pintaMenu() {
		
		System.out.println("-----Menú Agenda-----");
		System.out.println("1. Guardar Contactos");
		System.out.println("2. Ver Contactos");
		System.out.println("3. Eliminar Contacto");
		System.out.println("4. Editar Contacto");
		System.out.println("5. Salir de la Agenda");
		System.out.println("---------------------");
		
	}
	
	
	public static void main(String[] args) {
		
		int opc = 0, tamaño = 0;
		String vNombres[], vTelefonos[];
		
		Scanner leer = new Scanner (System.in);
		
		
		System.out.println("Introduce el Número de Contactos que Debería Guardar la Agenda");
		tamaño = leer.nextInt();
		
		
		vNombres = new String[tamaño];
		vTelefonos = new String[tamaño];
		
		
		System.out.println("Introduce la Opción a Realizar");
		opc = leer.nextInt();
		
		
		pintaMenu();
		
		switch (opc) {
		
		case 1:
			
			
			
			break;
			
			
		case 2:
			
			
			
			break;
			
			
		case 3:
			
			
			
			break;
			
			
		case 4:
			
			
			
			break;
			
			
		case 5:
			
			System.out.println("Aplicación de Agenda Teléfonica Cerrada");
			
			break;
			
		}
				
	}
}
