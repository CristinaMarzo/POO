
public class MetodosEnJavaConEjemplos {

}

class MetodoAdicional {
	 public static void main(String[] args) {
	        Vehiculo minivan = new Vehiculo();
	        Vehiculo sportscar = new Vehiculo();
	        //Asigando valores a los campos en minivan
	        minivan.pasajeros=9;
	        minivan.capacidad=15;
	        minivan.mpg=20;
	        //Asigando valores a los campos en minivan
	        sportscar.pasajeros=10;
	        sportscar.capacidad=25;
	        sportscar.mpg=30;
	        System.out.print("La Minivan puede llevar " +minivan.pasajeros +". ");
	        minivan.rango();
	        System.out.print("El Sportscar puede llevar " +minivan.pasajeros +". ");
	        sportscar.rango();
	    }

}

class ComprobarNumero {
    //Retorna true si x es par
    boolean esPar(int x){
        if ((x%2)==0) return true;
        else return false;
    }
}
class ParametroDemo {
    public static void main(String[] args) {
        ComprobarNumero e=new ComprobarNumero();
        if (e.esPar(10)) System.out.println("10 es par.");
        if (e.esPar(9)) System.out.println("9 es par.");
        if (e.esPar(8)) System.out.println("8 es par.");
    }
}

class Divisor {
    //Retorna true si x es par
    boolean esDivisor(int a, int b){
        if ((b%a)==0) return true;
        else return false;
    }
}
class DivisorDemo {
    public static void main(String[] args) {
        Divisor x =new Divisor();
        if (x.esDivisor(2,20)) System.out.println("2 es Divisor de 20");
        if (x.esDivisor(3,20)) System.out.println("3 es Divisor de 20");
    }
}