
public class QueEsUnaClaseEnJava {

}

class Vehiculo {
    int pasajeros;  //números de pasajeros
    int capacidad;  //capacidad del combustible en galones
    int mpg;        //combustible consumido en millas por galon
    
    void rango (){
        System.out.println("Con rango de "+ capacidad*mpg);
    }
}

/* Un programa que usa la clase Vehiculo
El archivo se llama DemoVehiculo.java
*/

//Esta clase declara un objeto de tipo Vehiculo
class DemoVehiculo {
   public static void main(String[] args) {
       Vehiculo minivan = new Vehiculo();
       int rango;
       //asignando valores a los campos de minivan
       minivan.pasajeros = 9;
       minivan.capacidad = 15;
       minivan.mpg = 20;
       //Calcular el rango asumiendo un tanque lleno
       rango = minivan.capacidad * minivan.mpg;
       System.out.println("La Minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " millas");
}
}


class DosVehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();
        Vehiculo sportscar = new Vehiculo();
        int rango1, rango2;
        //asignando valores a los campos de minivan
        minivan.pasajeros = 9;
        minivan.capacidad = 15;
        minivan.mpg = 20;
        //asignando valores a los campos de sportscar
        sportscar.pasajeros = 10;
        sportscar.capacidad = 25;
        sportscar.mpg = 30;
        //Calcular el rango asumiendo un tanque lleno
        rango1 = minivan.capacidad * minivan.mpg;
        rango2 = sportscar.capacidad * sportscar.mpg;
        System.out.println("La Minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango1 + " millas");
        System.out.println("El Sportscar puede llevar " + sportscar.pasajeros + " pasajeros con un rango de " + rango2 + " millas");
        
        Vehiculo auto1 = new Vehiculo();
        Vehiculo auto2 = auto1;
        auto1.mpg = 28;
        System.out.println(auto1.mpg);
        System.out.println(auto2.mpg);
        
        Vehiculo auto3 = new Vehiculo();
        Vehiculo auto4 = auto3;
        Vehiculo auto5 = new Vehiculo();
        auto5 = auto4; //Ahora auto2 y auto3 se refieren al mismo objeto
        auto5.pasajeros = 6;
        System.out.println(auto5.pasajeros);
    }


}
