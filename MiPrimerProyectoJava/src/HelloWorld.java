
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte cont;
		byte numero=5;
		Scanner scanner = new Scanner(System.in);
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
