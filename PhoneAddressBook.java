/*
    CC2 - Interciclo 2016 
    Laboratorio #2
*/

import java.io.*;
import java.util.*;

public class PhoneAddressBook {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void insert(ArrayList<LibretaContactos> contacts) throws Exception{
		System.out.println("INGRESO DE CONTACTOS: ");
		System.out.println("Ingrese apellido: ");
		String ap = br.readLine();
		System.out.println("Ingrese nombre: ");
		String nom = br.readLine();
		System.out.println("Ingrese numero de telefono: ");
		String tel = br.readLine();
		if ( !ap.equals("") && !nom.equals("") && !tel.equals("") ) {
			contacts.add(new LibretaContactos(ap,nom,tel));
			System.out.println("Contacto ingresado exitosamente!\n");
		} else System.out.println("Hubo un error al ingresar el contacto!\n");
	}

	public static void printAll(ArrayList<LibretaContactos> contacts) {
		System.out.println("--------------------------");
		for (LibretaContactos contact: contacts) {
			System.out.println(contact);
		}
		System.out.println("--------------------------");
	}
        
        public static void printFavorites(ArrayList<LibretaContactos> contacts) {
		System.out.println("--------------------------");
		for (LibretaContactos contact: contacts) {
                    if (contact.isFavorite())
			System.out.println(contact);
		}
		System.out.println("--------------------------");
	}

	public static int search(ArrayList<LibretaContactos> contacts, String telefono) {
		int count = 0;
		for (LibretaContactos contacto: contacts) {
			if (contacto.getPhoneNumber().equals(telefono)) return count;
			count++;
		}
		return -1;
	}

	public static void setFavorite(ArrayList<LibretaContactos> contacts) throws Exception {
		System.out.println("MANEJO DE FAVORITOS: ");
		System.out.println("Ingrese telefono del contacto: ");
		String telefono = br.readLine();
		int x = search(contacts,telefono);
		if (x == -1) {
			System.out.println("El contacto no se encontro!\n");
		} else {
                        contacts.get(x).setAsFavorite();
			System.out.println("\nContacto agregado a favoritos exitosamente!\n");
		}
	}

	public static void main(String[] args) throws Exception {
		
		ArrayList<LibretaContactos> contacts = new ArrayList<LibretaContactos>();

		contacts.add(new LibretaContactos("Molina","Maria","55560890"));
                contacts.add(new LibretaContactos("Lemus","Ali","45679012"));
		contacts.add(new LibretaContactos("Mendez","Marvin","42308814"));
                contacts.get(2).setAsFavorite();
		contacts.add(new LibretaContactos("Hernandez","Mario","53035550"));	

		System.out.println("Bienvenido a Phone Address Book !!\n");
		byte opcion = 0;
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("(1) Ingresar contacto \n(2) Agregar contacto a Favoritos \n(3) Listar todos los contactos \n(4) Listar contactos favoritos \n(5) Salir \n");
			System.out.println("Que operacion desea realizar: ");
			try {
				opcion = Byte.parseByte(br.readLine());
				switch(opcion) {
					case 1: {
							insert(contacts);
							break;
					}
					case 2: {
							setFavorite(contacts);
							break;
					}
					case 3: {
							printAll(contacts);
							break;
					}
					case 4: {
							printFavorites(contacts);
							break;
					}
					case 5: {
							System.out.println("Saliendo del programa...");
							break;
					}
					default:
						System.out.println("Opcion invalida!");
				}
			} catch (NumberFormatException e) { System.out.println("Opcion invalida!");}

		} while (opcion != 5);

	}
}