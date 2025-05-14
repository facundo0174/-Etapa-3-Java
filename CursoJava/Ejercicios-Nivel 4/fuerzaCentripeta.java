/* nivel 4 ejercicio 7
 * Cálculo de la fuerza centrípeta: 
Escribir un programa en Java que calcule la fuerza centrípeta necesaria para 
mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular 
y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la 
fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio 
de la trayectoria. Muestre el resultado por pantalla.
 */
import java.util.Scanner;
public class fuerzaCentripeta {
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        double m,v,r,fc;
        System.out.println("ingrese la masa del objeto.");
        m=read.nextDouble();
        System.out.println("ingrese la velocidad del objeto.");
        v=read.nextDouble();
        v*=v;
        System.out.println("ingrese el radio.");
        r=read.nextDouble();
        fc=m*v/r;
        System.out.println("la fuerza centripeta del objeto de masa "+m+"kg, velocidad "+v+"m/s y radio "+r+"m es igual a "+fc+
                "N.");
        read.close();
    }
}
