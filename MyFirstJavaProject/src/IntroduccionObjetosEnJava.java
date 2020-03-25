
public class IntroduccionObjetosEnJava {

}

//Declaraci�n de clase
class Perro {
	    // Variables de instancia
	    String nombre;
	    String raza;
	    int edad;
	    String color;
	 
	    // Declaraci�n del constructor de clase
	    public Perro(String nombre, String raza,
	                   int edad, String color)
	    {
	        this.nombre = nombre;
	        this.raza= raza;
	        this.edad = edad;
	        this.color = color;
	    }
	 
	    // m�todo 1
	    public String getNombre()
	    {
	        return nombre;
	    }
	 
	    // m�todo 2
	    public String getRaza()
	    {
	        return raza;
	    }
	 
	    // m�todo 3
	    public int getEdad()
	    {
	        return edad;
	    }
	 
	    // m�todo 4
	    public String getColor()
	    {
	        return color;
	    }
	 
	    @Override
	    public String toString()
	    {
	        return("Hola mi nombre es "+ this.getNombre()+
	               ".\nMi raza, edad y color son: " +
	               this.getRaza()+"," + this.getEdad()+
	               ","+ this.getColor());
	    }
	 
	    public static void main(String[] args)
	    {
	        Perro clifford = new Perro("clifford","pitbull", 5, "blanco");
	        System.out.println(clifford.toString());
	    }

}


class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

class Test
{
    // usando el objeto Dog
    Animal obj1 = new Dog(),
    // usando el objeto Cat
    obj2 = new Cat();
}

