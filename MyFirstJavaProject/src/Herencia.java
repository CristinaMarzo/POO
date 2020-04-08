public class Herencia {

}

/*Superclase: la clase cuyas caracter�sticas se heredan se conoce como superclase
 (o una clase base o una clase principal).

Subclase: la clase que hereda la otra clase se conoce como subclase
(o una clase derivada, clase extendida o clase hija).
La subclase puede agregar sus propios campos y m�todos adem�s de los campos y m�todos
de la superclase.

Reutilizaci�n: la herencia respalda el concepto de �reutilizaci�n�, es decir, cuando queremos
crear una clase nueva y ya hay una clase que incluye parte del c�digo que queremos, podemos
derivar nuestra nueva clase de la clase existente. Al hacer esto, estamos reutilizando los
campos/atributos y m�todos de la clase existente. Tambi�n podemos a�adir atributos y m�todos
propios. Adem�s, aunque una subclase incluye a todos los miembros de su superclase, no puede
acceder a los miembros de la superclase que se han declarado privados.*/

/*Superclase predeterminada: excepto la clase Object, que no tiene superclase, cada clase tiene
una y solo una superclase directa (herencia �nica). En ausencia de cualquier otra superclase
expl�cita, cada clase es impl�citamente una subclase de la clase Object.

La superclase solo puede ser una: una superclase puede tener cualquier cantidad de subclases.
Pero una subclase solo puede tener una superclase. Esto se debe a que Java no admite herencia
m�ltiple con clases. Aunque con interfaces, la herencia m�ltiple es compatible con java.

Heredar constructores: una subclase hereda todos los miembros (campos, m�todos y clases
anidadas) de su superclase. Los constructores no son miembros, por lo que no son heredados
por subclases, pero el constructor de la superclase puede invocarse desde la subclase.

Herencia de miembros privados: una subclase no hereda los miembros privados de su clase principal.
Sin embargo, si la superclase tiene m�todos p�blicos o protegidos (como getters y setters) para
acceder a sus campos privados, estos tambi�n pueden ser utilizados por la subclase.*/

/*Los campos heredados se pueden usar directamente, al igual que cualquier otro campo.

Podemos declarar nuevos campos en la subclase que no est�n en la superclase.

Los m�todos heredados se pueden usar directamente tal como son.

Podemos escribir un nuevo m�todo de instancia en la subclase que tenga la misma firma que
el de la superclase, anul�ndolo (como en el ejemplo anterior, el m�todo toString() se reemplaza).

Se puede escribir un nuevo m�todo est�tico en la subclase que tiene la misma firma que el
de la superclase, escondi�ndolo as�.

Podemos declarar nuevos m�todos en la subclase que no est�n en la superclase.

Podemos escribir un constructor de subclase que invoca el constructor de la superclase, ya
sea impl�citamente o mediante la palabra clave super.*/

//Clase para objetos de dos dimensiones
class DosDimensiones{
  double base;
  double altura;
  
  void mostrarDimension(){
      System.out.println("La base y altura es: "+base+" y "+altura);
  }
}

//Una subclase de DosDimensiones para Triangulo
class Triangulo extends DosDimensiones{
    String estilo;
    double area(){
        return (base*altura)/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}

class Lados3{
    public static void main(String[] args) {
        Triangulo t1=new Triangulo();
        Triangulo t2=new Triangulo();
        t1.base=4.0;
        t1.altura=4.0;
        t1.estilo="Estilo 1";
        t2.base=8.0;
        t2.altura=12.0;
        t2.estilo="Estilo 2";
        System.out.println("Informaci�n para T1: ");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("Su �rea es: "+t1.area());
        System.out.println();
        System.out.println("Informaci�n para T2: ");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        System.out.println("Su �rea es: "+t2.area());
    }
}

//Clase para objetos de dos dimensiones
class DosDimensionesPriv{
  private double base;
  private double altura;
  //M�todos de acceso para base y altura
  double getBase(){return base;}
  double getAltura(){return altura;}
  void setBase(double b){base=b;}
  void setAltura (double h){altura=h;}
  void mostrarDimension(){
      System.out.println("La base y altura es: "+base+" y "+altura);
  }
}

//Una subclase de DosDimensiones para Triangulo
class TrianguloPriv extends DosDimensionesPriv{
  String estilo;
  double area(){
      return getBase()*getAltura()/2;
  }
  void mostrarEstilo(){
      System.out.println("Triangulo es: "+estilo);
  }
}
class Lados3Priv{
  public static void main(String[] args) {
      TrianguloPriv t1=new TrianguloPriv();
      TrianguloPriv t2=new TrianguloPriv();
      t1.setBase(4.0);
      t1.setAltura(4.0);
      t1.estilo="Estilo 1";
      t2.setBase(8.0);
      t2.setAltura(12.0);
      t2.estilo="Estilo 2";
      System.out.println("Informaci�n para T1: ");
      t1.mostrarEstilo();
      t1.mostrarDimension();
      System.out.println("Su �rea es: "+t1.area());
      System.out.println();
      System.out.println("Informaci�n para T2: ");
      t2.mostrarEstilo();
      t2.mostrarDimension();
      System.out.println("Su �rea es: "+t2.area());
  }
}