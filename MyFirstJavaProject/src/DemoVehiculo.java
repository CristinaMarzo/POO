/* Un programa que usa la clase Vehiculo
 El archivo se llama DemoVehiculo.java
 */
class Vehiculo {
    int pasajeros;  //números de pasajeros
    int capacidad;  //capacidad del combustible en galones
    int mpg;        //combustible consumido en millas por galon
}
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