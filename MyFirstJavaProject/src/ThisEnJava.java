
public class ThisEnJava {

}

class Potencia {
    double b;
    int e;
    double valor;
    Potencia(double base, int exp){
        b=base;
        e=exp;
        valor=1;
        if (exp==0) return;
        for ( ; exp>0; exp--) valor = valor * base;
    }
     double get_potencia(){
        return valor;
}
}


class DemoPotencia {
public static void main(String[] args) {
    Potencia x=new Potencia(4.0,2);
    Potencia y=new Potencia(2.5,1);
    Potencia z=new Potencia(2.7,2);
    System.out.println(x.b+ " elevado a la potencia de "+ x.e+", es igual a: "+x.get_potencia());
    System.out.println(y.b+ " elevado a la potencia de "+ y.e+", es igual a: "+y.get_potencia());
    System.out.println(z.b+ " elevado a la potencia de "+ z.e+", es igual a: "+z.get_potencia());
}
}

class Potencia2 {
    double b;
    int e;
    double valor;
    Potencia2(double base, int exp){
        this.b=base;
        this.e=exp;
        this.valor=1;
        if (exp==0) return;
        for ( ; exp>0; exp--) this.valor = this.valor * base;
    }
     double get_potencia(){
        return this.valor;
}
}

class Potencia3 {
    double b;
    int e;
    double valor;
    
    Potencia3(double b, int e){
    this.b=b;
    this.e=e;
    valor=1;
    if (e==0) return;
    for ( ; e>0; e--) valor = valor * b;
}
}

class Test2
{
    int a;
    int b;
     
    // Constructor parametrizado
    Test2(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
 
    void display()
    {
        //Visualización del valor de las variables a y b
        System.out.println("a = " + a + "  b = " + b);
    }
 
    public static void main(String[] args)
    {
        Test2 object = new Test2(10, 20);
        object.display();
    }
}

//Código Java sobre el uso de this() para
//invocar al constructor de la clase actual
class Test3
{
 int a;
 int b;

 //Constructor predeterminado
 Test3()
 {  
     this(10, 20);
     System.out.println("Dentro del constructor predeterminado \n");
 }
  
 //Constructor parametrizado
 Test3(int a, int b)
 {
     this.a = a;
     this.b = b;
     System.out.println("Dentro del constructor parametrizado");
 }

 public static void main(String[] args)
 {
     Test3 object = new Test3();
     System.out.println(object.a);
 }
}

//Código Java sobre el uso de laa palabra clave 'this'
//para devolver la instancia de la clase actual
class Test4
{
  int a;
  int b;

  //Constructor predeterminado
  Test4()
  {
      a = 10;
      b = 20;
  }
   
  //Método que devuelve la instancia de la clase actual
  Test4 get()
  {
      return this;
  }
   
  //Visualización del valor de las variables a y b
  void display()
  {
      System.out.println("a = " + a + "  b = " + b);
  }

  public static void main(String[] args)
  {
      Test4 object = new Test4();
      object.get().display();
  }
}

//Código de Java para usar 'this' 
//como parámetro de método
class Test5
{
 int a;
 int b;
  
 // Constructor predeterminado
 Test5()
 {
     a = 10;
     b = 20;
 }
  
 // Método que recibe 'this' como parámetro
 void display(Test5 obj)
 {
     System.out.println("a = " + a + "  b = " + b);
 }

 // Método que devuelve la instancia de la clase actual
 void get()
 {
     display(this);
 }

 public static void main(String[] args)
 {
     Test5 object = new Test5();
     object.get();
 }
}

//Código Java sobre el uso de 'this' para invocar
//el método de clase actual
class Test6 {

 void display()
 {
     // método que llama a show()
     this.show();
 
    System.out.println("Dentro del método display");
 }
  
 void show() {
     System.out.println("Dentro del método show");
 }
  

 public static void main(String args[]) {
     Test6 t1 = new Test6();
     t1.display();
 }
}

//Código Java para usar 'this' como un argumento
//en la llamada de constructor class A
//con el objeto de class B como su miembro de datos
class A
{
 B obj;
  
 // Constructor parametrizado con el objeto de B
 // como un parámetro
 A(B obj)
 {
     this.obj = obj;
     
  // llamando al método display de class B
     obj.display();
 }
  
}

class B
{
 int x = 5;
  
 //Constructor predeterminado que crea un objeto de A
 //pasando 'this' como un argumento en el constructor
 B()
 {
     A obj = new A(this);
 }
  
 // método para mostrar el valor de x
 void display()
 {
     System.out.println("Valor de x en Class B: " + x);
 }
  
 public static void main(String[] args) {
     B obj = new B();
 }
}