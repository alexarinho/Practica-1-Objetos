import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Gimnasio gim = new Gimnasio("Infogym", "Alacañiz", 20);
		Menu menu = new Menu();
		int opc=0;
		
		do {
			opc = menu.pintaMenuPrincipal();
			
			switch (opc) {
			case 1:
				gim.añadirPersona();
				break;

			case 2:
				Persona persona = gim.buscarPersona();
				if (persona == null) {
					System.out.println("No se a encontrado la persona");
				}else {
					int opc2 =0;
					do {
						opc2 = menu.pintaMenuPersona();
						
						switch(opc2) {
						case 1:
							if(persona.esMayorDeEdad()) {
								System.out.println("Es mayor de edad");
							}else {
								System.out.println("Es menor de edad");
							}
							break;
						case 2:
							switch(persona.calcularIMC()) {
							case -1:
								System.out.println(persona.getNombre()+" Esta muy delgado");
								break;
							case 0:
								System.out.println(persona.getNombre()+ " Esta en su peso ideal");
								break;
							case 1:
								System.out.println(persona.getNombre()+ " Esta persona tiene sobrepeso");
							}
							break;
						case 3:
							System.out.println(persona);
							break;
						case 4:
							Scanner leer2 = new Scanner(System.in);
							System.out.println("Dime el nuevo nombre");
							persona.setNombre(leer2.nextLine());
							break;
						case 5:
							default:
								System.out.println("Salir");
								break;
						}
					}while (opc2!= 5);
				}
				 
			case 3:
				//boolean borrado = borrarPersona(vClientes);
				if(gim.borrarPersona()) {
					System.out.println("Persona borrada");
				} else {
					System.out.println("Persona no encontrada");
				}
				break;
			
			case 4:
				gim.verTodasPersonas();
				break;
			}
			
		}while(opc!=5);
		
	}

	

}
