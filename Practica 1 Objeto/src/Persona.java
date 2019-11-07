import java.util.Random;

public class Persona {
 
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	private final char hombre = 'H';
	
	public Persona() {
		nombre="";
		edad = 0;
		dni = generaDNI();
		sexo = hombre;
		peso = 0;
		altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		comprobarSexo(sexo);
		dni = generaDNI();
		peso = 0;
		altura = 0;
	}

	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		
		double imc=0;
		final int bajoPeso = -1;
		final int pesoCorrecto = 0;
		final int sobrePeso = 1;
		
		imc = peso/(altura*altura);
		
		if(imc<18.5) {
			return bajoPeso;
		}else if(imc<=25){
			return pesoCorrecto;
		}else {
			return sobrePeso;
		}
		
	}
	
	public boolean esMayorDeEdad() {
		
		if(this.edad>=18) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private void comprobarSexo(char sexo) {
		
		if(this.sexo!='H' && this.sexo!='M') {
			this.sexo=hombre;
		} else {
			this.sexo=sexo;
		}
	}
	
	public String toString(){
		return nombre + " " + edad + " " + sexo + " " + dni + " " + altura + " " + peso;
	}
	
	
	
	private String generaDNI() {
		String[] vLetras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		String dni = "";
		Random r = new Random();
		
	
		for (int i=0;i<8;i++) {
			int n = r.nextInt(10);
			dni +=Integer.toString(n);
		}
		
		int pos = Integer.valueOf(dni)%23;
		dni += "-" + vLetras[pos];
		
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
