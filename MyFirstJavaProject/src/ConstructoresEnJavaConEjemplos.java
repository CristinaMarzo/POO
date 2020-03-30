
public class ConstructoresEnJavaConEjemplos {

}

class MiClase {
    int x;
    MiClase(){ //constructor. fija las x de todos los mi clase que haga a 10
        x=10;
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
       MiClase t1= new MiClase();
       MiClase t2= new MiClase();
        System.out.println(t1.x + " - "+t2.x);
    }
}

class MiClase2 {
    int x;
    MiClase2(int i){ //constructor parametrizado
        x=i;
    }
}
class ConstructorDemo2 {
    public static void main(String[] args) {
       MiClase2 t1= new MiClase2(15);
       MiClase2 t2= new MiClase2(28);
        System.out.println(t1.x + " - "+t2.x);
    }
}

class Vehiculo2 {
    int pasajeros;  //números de pasajeros
    int capacidad;  //capacidad del combustible en galones
    int mpg;        //combustible consumido en miles por galon
    //Esto es un constructor para Vehiculo
    Vehiculo2 (int p, int c, int m) {
        pasajeros=p;
        capacidad=c;
        mpg=m;
       }
     //Retornando el rango
    int rango(){
        return mpg*capacidad;
    }
    //Calcular el combustible necesario para una distancia dada
    double capacidadnueva(int miles){
        return (double)miles/mpg;
    }
 }
class DemoVehiculo2 {
    public static void main(String[] args) {
        Vehiculo2 minivan = new Vehiculo2(9,15,20);
        Vehiculo2 sportscar = new Vehiculo2(10,25,30);
        double galones;
        int distancia = 250;
        galones=minivan.capacidadnueva(distancia);
        System.out.println("Para ir a "+distancia+" en minivan, se necesita "+galones+" galones");
        galones=sportscar.capacidadnueva(distancia);
        System.out.println("Para ir a "+distancia+" en sportscar, se necesita "+galones+" galones");
    }
}
