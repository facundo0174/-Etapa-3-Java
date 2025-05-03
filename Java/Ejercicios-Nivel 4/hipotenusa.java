/*nivel 4 ejercicio 3 
 * Cálculo de la hipotenusa de un triángulo: Escribir un programa en Java que 
calcule la hipotenusa de un triángulo rectángulo, dados los valores de los catetos. 
Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la hipotenusa, a y b son los catetos. 
*/
import java.util.Scanner;
public class hipotenusa {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        double hipo,catmen,catmay;
        System.out.println("ingrese el cateto menor.");
        catmen=read.nextDouble();
        System.out.println("ingrese el cateto mayor");
        catmay=read.nextDouble();
        hipo=catmen*catmen+(catmay*catmay);
        System.out.println("el valor de la hipotenusa es igual a: "+hipo);
        read.close();
    }    
}
