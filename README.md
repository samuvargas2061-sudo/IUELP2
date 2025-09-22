# IUELP2
22/09/2025

Agregacion y composicion
Agregacion = debil; 
Composicion = fuerte;
//////////////Ejemplo # 1/////////
package poo;

public class Punto {
    
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x= " + x + ", y= " + y + '}';
    }
}

/////////////////////////////////////////////////
package poo;
public class Circunferencia {
 private double radio;
 private Punto centro;
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public void agregarCentro(Punto p){
        centro = p;
    }
    public double calcularArea(){
        return 3.1416*radio*radio;
    }
    @Override
    public String toString() {
        return "Circunferencia {" + "radio= " + radio + ", centro= " + centro + '}';
    }
}

///////////////////////////////////

package poo;
import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese las dos coordenadas del punto: ");
        double x = sc.nextInt();
        double y = sc.nextInt();
        Punto p1 = new Punto(x,y);
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        
        double radio = sc.nextDouble();
        
        Circunferencia c1 = new Circunferencia(radio);
        c1.agregarCentro(p1);
        
        System.out.println("El area del circulo es: " + c1.calcularArea());
        
        System.out.println(c1);
    }
    
}
