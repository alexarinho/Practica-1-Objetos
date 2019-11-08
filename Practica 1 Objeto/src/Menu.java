import java.util.Scanner;

public class Menu {

	public Menu() {
		
	}
	
	public int pintaMenuPrincipal() {
		int opc = 0;
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("---Menu principal---");
			System.out.println("1. A�adir Persona");
			System.out.println("2. Buscar Persona");
			System.out.println("3. Borrar Persona");
			System.out.println("4. Ver todos los clientes");
			System.out.println("5. Salir");
			System.out.println("--------------------");
			opc = leer.nextInt();
		}while(opc<1 || opc>5);
		
		return opc;
	}
	
	public int pintaMenuPersona() {
		int opc=0;
		
		do {
			System.out.println("---Menu persona---");
			System.out.println("1. Ver si es mayor de edad");
			System.out.println("2. Comprobar IMC");
			System.out.println("3. Ver datos");
			System.out.println("4. Editar datos");
			System.out.println("5. Volver");
			System.out.println("------------------");
		}while(opc<1 || opc>5);
		return opc;
	}
}
