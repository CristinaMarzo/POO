import java.util.Scanner;  // Import the Scanner class

public class HelloWorld {

	public static void main(String[] args) {
		
		byte cont;
		int numero;
		System.out.println("Bienvenido al programa para calcular las tablas de multiplicar.");
		System.out.println("Introduzca el numero deseado: ");
		try (Scanner scanner = new Scanner(System.in)) {
			numero = scanner.nextInt();
		}
		System.out.println("Hola, mundo");
		for (cont=0; cont<=10; cont++){
			System.out.print(cont);
			System.out.print(" X ");
			System.out.print(numero);
			System.out.print(" = ");
			System.out.println(cont*numero);
		
		}
	}

}

