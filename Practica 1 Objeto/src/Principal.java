import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Cambios
		Scanner leer = new Scanner(System.in);
		
		Persona p = new Persona();
		System.out.println(p);
		
		//char sexo = leer.next().charAt(0);
		Persona p2 = new Persona("Juan", 20, 'M');
		System.out.println(p2);
		
		Persona p3 = new Persona("Pepe", 50, "6736736-W", 'H', 73, 1.88);
		System.out.println(p3);
		
		System.out.println(p3.calcularIMC() );
	}

}
