import java.util.Scanner;

public class Principal {
	
	private static void añadirPersona(Persona[] vClientes) {
		Scanner leer = new Scanner(System.in);
		Scanner leerString = new Scanner(System.in);
		String nombre="", dni="";
		char sexo;
		double peso=0, altura=0;
		int edad;
		
		for (int i = 0; i < vClientes.length; i++) {
			if(vClientes[i] == null) {
				System.out.println("Dime el nombre");
				nombre=leerString.nextLine();
				if(nombre.equalsIgnoreCase("")){
					vClientes[i] = new Persona();
					break;
				}
				System.out.println("Dime la edad");
				edad=leer.nextInt();
				
				System.out.println("Dime el sexo");
				sexo=leerString.next().charAt(0);
				
				leerString = new Scanner(System.in);
				System.out.println("Dime el dni");
				dni=leerString.nextLine();
				if(dni.equalsIgnoreCase("")) {
					vClientes[i] = new Persona(nombre, edad, sexo);
					break;
				}
				System.out.println("Dime el peso");
				peso=leer.nextDouble();
				
				System.out.println("Dime la altura");
				altura=leer.nextDouble();
				vClientes[i] = new Persona(nombre, edad, dni, sexo, peso, altura);
				break;
			}
		}
	}
	
	private static void verTodasPersonas(Persona[] vClientes) {
		for (int i = 0; i < vClientes.length; i++) {
			if(vClientes[i]!=null) {
				System.out.println(vClientes[i]);
			}
		}
	}
	
	private static int buscarPersona(Persona[] vClientes) {
		Scanner leer = new Scanner(System.in);
		int pos=-1;
		String nombre;
		System.out.println("Dime el nombre de la persona que quieres buscar");
		
		for (int i = 0; i < vClientes.length; i++) {
			if(vClientes[i].getNombre()) {
				
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Persona[] vClientes = new Persona[100];
		Menu menu = new Menu();
		int opc=0;
		
		do {
			opc = menu.pintaMenuPrincipal();
			
			switch (opc) {
			case 1:
				añadirPersona(vClientes);
				break;

			case 2:
				
				break;
				
			case 3:
				
				break;
			
			case 4:
				verTodasPersonas(vClientes);
				break;
			}
			
			
			
		}while(opc!=5);
		
	}

}
