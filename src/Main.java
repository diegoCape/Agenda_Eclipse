import java.util.Scanner;

public class Main {

	public static void pintaMenu() {
		
		System.out.println("-----Menú Agenda-----");
		System.out.println("1. Guardar Contactos en la Agenda");
		System.out.println("2. Buscar un Contacto en la Agenda");
		System.out.println("3. Borrar un Contacto de la Agenda");
		System.out.println("4. Editar un Contacto de la Agenda");
		System.out.println("5. Ver Todos los Contactos de la Agenda");
		System.out.println("6. Salir de la Agenda");
		System.out.println("---------------------");
		
	}
	
	
	public static void guardarContacto(String mContactos[][], int filas) {
		
		String nombre = "", telf = "";
		
		Scanner leer = new Scanner (System.in);
		
		/*
		 * Leemos por Teclado el Nombre y Telf. del Contacto y lo Guardamos en
		 * su Correspondiente Posición de la Matriz
		 */
		
		
		System.out.println("Introduce el Nombre del Contacto a Guardar");
		nombre = leer.next();
		
		System.out.println("Introduce el Teléfono del Contacto a Guardar");
		telf = leer.next();
		
		
		for (int i = 0; i < filas; i++) {
			if (mContactos[i][0].equals("")) {
				
				mContactos[i][0] = nombre;
				mContactos[i][1] = telf;
				i = filas;
				
			}
		}
		
		System.out.println("El Contacto Queda Así Guardado ==>    Nombre: " + nombre + "  Teléfono: " + telf);
		System.out.println("------------------------------------------------------------------------------");
	}
	
	
	public static void verTodosContactos(String mContactos[][], int filas) {
		
		/*
		 * Para Ver Todos los Contactos Existentes de la Matriz,
		 * la Recorremos Posición a Posición e Imprimimos por Pantalla
		 */
		
		for (int i = 0; i < filas; i++) {
				
			System.out.println("Nombre: " + mContactos[i][0]);
			System.out.println("Teléfono: " + mContactos[i][1]);
			
		}
		
	}
	
	
	public static int buscarContactos(String mContactos[][], int filas, int col) {
		
		String comprNombre = "", comprTelf = "";
		int opcBuscar = 0, pos = 0;
		boolean encontrado;
		
		Scanner leer = new Scanner (System.in);
		
		
		do {
			
			System.out.println("Introduce 1 Para Buscar por Nombre");
			System.out.println("Introduce 2 Para Buscar por Teléfono");
			System.out.println("Introduce 3 Para Salir de la Búsqueda de Contactos");
			opcBuscar = leer.nextInt();
			encontrado = false;
			
			switch (opcBuscar) {
			
			case 1:
				
				System.out.println("Introduce el Nombre del Contacto a Buscar");
				comprNombre = leer.next();
				
				for (int i = 0; i < filas; i++) {
					if (mContactos[i][0].equalsIgnoreCase(comprNombre)) {
						
						pos = i;
						encontrado = true;
						System.out.println("Este es el Contacto que Buscabas ==>    Nombre: " + mContactos[i][0] + "  Teléfono: " + mContactos[i][1]);
						System.out.println("-------------------------------------------------------------------------------------------------------");
					}
				}
				
				if (encontrado == false) {
					
					System.out.println("No Existe un Contacto con ese Nombre");
					System.out.println("------------------------------------");
				}
			
				break;
				
				
			case 2:
				
				System.out.println("Introduce el Teléfono del Contacto a Buscar");
				comprTelf = leer.next();
				
				for (int i = 0; i < filas; i++) {
					if (mContactos[i][1].equalsIgnoreCase(comprTelf)) {
						
						pos = i;
						encontrado = true;
						System.out.println("Este es el Contacto que Buscabas ==>    Nombre: " + mContactos[i][0] + "  Teléfono: " + mContactos[i][1]);
						System.out.println("-------------------------------------------------------------------------------------------------------");
					}
				}
				
				if (encontrado == false) {
					
					System.out.println("No Existe un Contacto con ese Teléfono");
					System.out.println("------------------------------------");
				}
				
				break;
				
				
			case 3:
				
				System.out.println("Búsqueda de Contactos Finalizada");
				
				break;
			}
			
		}while(opcBuscar != 3);
		
		return pos;
	}
	
	
	public static void editarContacto(String mContactos[][], int filas) {
		
		
		
	}
	
	
	public static void borrarContacto(String mContactos[][], int filas) {
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		int opc = 0, filas = 0, col = 2;
		String mContactos[][];
		
		Scanner leer = new Scanner (System.in);
		
		
		System.out.println("Introduce el Número de Contactos que Debería Guardar la Agenda");
		filas = leer.nextInt();
		
		
		/*
		 * Para Esta Versión de la Agenda Utilizaremos una Matriz con Dos Columnas,
		 * una Para los Nombres y Otra para los Teléfonos y una Cantidad de Filas Variable,
		 * a Gusto del Usuario, de lo Cual Dependera el Número de Contactos de la Agenda
		 */
		mContactos = new String[filas][col];
		
		
		//Iniciamos a Vacio Todas las Posiciones de la Matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < col; j++) {
				
				mContactos[i][j] = "";
			}
		}
		
		/*
		 * Mostramos el Menú por Pantalla y Leemos la Opción Escogida
		 * Creamos el Bucle Para Realizar las Operaciones de la Agenda,
		 * Dónde al Escoger una de Estas, la Implementamos
		 */
		
		do {
			
			pintaMenu();
			System.out.println("Introduce la Acción que Quieras Realizar");
			opc = leer.nextInt();
			
			switch (opc) {
			
			case 1:
				
				guardarContacto(mContactos, filas);
				
				break;
				
				
			case 2:
				
				buscarContactos(mContactos, filas, col);
				
				break;
				
				
			case 3:
				
				editarContacto(mContactos, filas);
				
				break;
				
				
			case 4:
				
				borrarContacto(mContactos, filas);
				
				break;
				
				
			case 5:
				
				verTodosContactos(mContactos, filas);
				
				break;
				
				
			case 6:
				
				System.out.println("Aplicación 'Agenda Teléfonica' Terminada");
				
				break;
			}
			
		}while(opc != 6);
		
		
		
	}
}
