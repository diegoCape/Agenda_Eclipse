import java.util.Scanner;

public class Main {

	public static int pintaMenu() {
		
		int opc = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("-----Menú Agenda-----");
		System.out.println("1. Guardar Contactos en la Agenda");
		System.out.println("2. Buscar un Contacto en la Agenda");
		System.out.println("3. Borrar un Contacto de la Agenda");
		System.out.println("4. Editar un Contacto de la Agenda");
		System.out.println("5. Ver Todos los Contactos de la Agenda");
		System.out.println("6. Salir de la Agenda");
		System.out.println("---------------------");
		
		System.out.println("Introduce la Acción que Quieras Realizar");
		opc = leer.nextInt();
		
		return opc;
	}
	
	public static void inicializarMatrizVacio(String mContactos[][]) {
		
		//Iniciamos a Vacio Todas las Posiciones de la Matriz
			for (int i = 0; i < mContactos.length; i++) {
						
					mContactos[i][0] = "";
					mContactos[i][1] = "";
					
			}
	}
	
	public static void guardarContacto(String mContactos[][]) {
		
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
		
		
		for (int i = 0; i < mContactos.length; i++) {
			if (mContactos[i][0].equals("")) {
				
				mContactos[i][0] = nombre;
				mContactos[i][1] = telf;
				break;	
			}
		}
			
		System.out.println("El Contacto Queda Así Guardado ==>    Nombre: " + nombre + "  Teléfono: " + telf);
		System.out.println("------------------------------------------------------------------------------");
	}
	
	public static void verTodosContactos(String mContactos[][]) {
		
		/*
		 * Para Ver Todos los Contactos Existentes de la Matriz,
		 * la Recorremos Posición a Posición e Imprimimos por Pantalla
		 */
		
		for (int i = 0; i < mContactos.length; i++) {
				
			System.out.println(" ");
			System.out.print("Nombre: " + mContactos[i][0] + "  -  ");
			System.out.println("Teléfono: " + mContactos[i][1]);
			
		}
		
	}
	
	public static void buscarContactos(String mContactos[][]) {
		
		String comprNombre = "", comprTelf = "";
		int opcBuscar = 0;
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
				
				for (int i = 0; i < mContactos.length; i++) {
					if (mContactos[i][0].equalsIgnoreCase(comprNombre)) {
						
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
				
				for (int i = 0; i < mContactos.length; i++) {
					if (mContactos[i][1].equalsIgnoreCase(comprTelf)) {
						
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
		
	}
	
	public static void editarContacto(String mContactos[][]) {
		
		String nombre = "", telf = "";
		String comprNombre = "", comprTelf = "";
		int opcEditar = 0;
		boolean encontrado;
		
		Scanner leer = new Scanner (System.in);
		
		
		do {
			
			System.out.println("Introduce 1 Para Buscar por Nombre un Contacto Para Editarlo");
			System.out.println("Introduce 2 Para Buscar por Teléfono un Contacto Para Editarlo");
			System.out.println("Introduce 3 Para Salir de la Edición de Contactos");
			opcEditar = leer.nextInt();
			encontrado = false;
			
			switch (opcEditar) {
			
			case 1:
				
				System.out.println("Introduce el Nombre del Contacto a Buscar Para Editarlo");
				comprNombre = leer.next();
				
				for (int i = 0; i < mContactos.length; i++) {
					if (mContactos[i][0].equalsIgnoreCase(comprNombre)) {
						
						System.out.println("El Contacto ha sido Encontrado, Procede a Editarlo:");
						System.out.println("Introduce el Nuevo Nombre del Contacto");
						nombre = leer.next();
						
						System.out.println("Introduce el Nuevo Teléfono del Contacto");
						telf = leer.next();
						
						encontrado = true;
						
						for (i = 0; i < mContactos.length; i++) {
								
							mContactos[i][0] = nombre;
							mContactos[i][1] = telf;
							break;
							
						}
						
						System.out.println("El Nuevo Contacto Queda Así Guardado ==>    Nombre: " + nombre + "  Teléfono: " + telf);
						System.out.println("------------------------------------------------------------------------------");
						break;
					}
				}
				
				if (encontrado == false) {
					
					System.out.println("No Existe un Contacto con ese Nombre, Imposible de Editar");
					System.out.println("------------------------------------");
				}
			
				break;
				
				
			case 2:
				
				System.out.println("Introduce el Teléfono del Contacto a Buscar Para Editarlo");
				comprTelf = leer.next();
				
				for (int i = 0; i < mContactos.length; i++) {
					if (mContactos[i][1].equalsIgnoreCase(comprTelf)) {
						
						System.out.println("El Contacto ha sido Encontrado, Procede a Editarlo:");
						System.out.println("Introduce el Nuevo Nombre del Contacto");
						nombre = leer.next();
						
						System.out.println("Introduce el Nuevo Teléfono del Contacto");
						telf = leer.next();
						
						encontrado = true;
						
						for (i = 0; i < mContactos.length; i++) {
								
							mContactos[i][0] = nombre;
							mContactos[i][1] = telf;
							break;
							
						}
						
						System.out.println("El Nuevo Contacto Queda Así Guardado ==>    Nombre: " + nombre + "  Teléfono: " + telf);
						System.out.println("------------------------------------------------------------------------------");
						break;
					}
				}
				
				if (encontrado == false) {
					
					System.out.println("No Existe un Contacto con ese Teléfono, Imposible de Editar");
					System.out.println("------------------------------------");
				}
				
				break;
				
				
			case 3:
				
				System.out.println("Edición de Contactos Finalizada");
				
				break;
			}
			
		}while(opcEditar != 3);
		
	}
	
	public static void borrarContacto(String mContactos[][]) {
		
		String comprNombre = "", comprTelf = "";
		int opcBorrar = 0;
		boolean encontrado;
		
		Scanner leer = new Scanner (System.in);
		
		
		do {
			
			System.out.println("Introduce 1 Para Buscar por Nombre un Contacto Para Borrarlo");
			System.out.println("Introduce 2 Para Buscar por Teléfono un Contacto Para Borrarlo");
			System.out.println("Introduce 3 Para Salir del Borrado de Contactos");
			opcBorrar = leer.nextInt();
			encontrado = false;
			
			switch (opcBorrar) {
			
			case 1:
				
				System.out.println("Introduce el Nombre del Contacto a Borrar");
				comprNombre = leer.next();
				
				for (int i = 0; i < mContactos.length; i++) {
					if (mContactos[i][0].equalsIgnoreCase(comprNombre)) {
						
						mContactos[i][0] = "";
						mContactos[i][1] = "";
						encontrado = true;
						
						System.out.println("El Contacto y su Teléfono Asociado han Sido Borrados ==>   Nombre:       Teléfono:  ");
						System.out.println("-------------------------------------------------------------------------------------------------------");
					}
				}
				
				if (encontrado == false) {
					
					System.out.println("No Existe un Contacto con ese Nombre, Imposible de Borrar");
					System.out.println("------------------------------------");
				}
			
				break;
				
				
			case 2:
				
				System.out.println("Introduce el Teléfono del Contacto a Borrar");
				comprTelf = leer.next();
				
				for (int i = 0; i < mContactos.length; i++) {
					if (mContactos[i][1].equalsIgnoreCase(comprTelf)) {
						
						mContactos[i][0] = "";
						mContactos[i][1] = "";
						encontrado = true;
						
						System.out.println("El Contacto y su Teléfono Asociado han Sido Borrados ==>   Nombre:       Teléfono:  ");
						System.out.println("-------------------------------------------------------------------------------------------------------");
					}
				}
				
				if (encontrado == false) {
					
					System.out.println("No Existe un Contacto con ese Teléfono, Imposible de Borrar");
					System.out.println("------------------------------------");
				}
				
				break;
				
				
			case 3:
				
				System.out.println("Borrado de Contactos Finalizado");
				
				break;
			}
			
		}while(opcBorrar != 3);
		
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
		
		
		
		inicializarMatrizVacio(mContactos);
		
		
		
		/*
		 * Mostramos el Menú por Pantalla y Leemos la Opción Escogida
		 * Creamos el Bucle Para Realizar las Operaciones de la Agenda,
		 * Dónde al Escoger una de Estas, la Implementamos
		 */
		
		do {
			
			opc = pintaMenu();
			
			switch (opc) {
			
			case 1:
				
				guardarContacto(mContactos);
				
				break;
				
				
			case 2:
				
				buscarContactos(mContactos);
				
				break;
				
				
			case 3:
				
				borrarContacto(mContactos);
				
				break;
				
				
			case 4:
				
				editarContacto(mContactos);
				
				break;
				
				
			case 5:
				
				verTodosContactos(mContactos);
				
				break;
				
				
			case 6:
				
				System.out.println("Aplicación 'Agenda Teléfonica' Terminada");
				
				break;
			}
			
		}while(opc != 6);
		
		
	}
}
