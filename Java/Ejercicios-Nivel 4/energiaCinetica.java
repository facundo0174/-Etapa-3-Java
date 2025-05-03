/*nivel 4 ejercicio 5
 * Cálculo de la energía cinética: 
Escribir un programa en Java que calcule la energía cinética de un objeto en 
movimiento, dados su masa y su velocidad. 
Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa 
del objeto y v es la velocidad. Muestre el resultado por pantalla. 
 */
import java.util.Scanner;
public class energiaCinetica {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        double ec,v,m;
        System.out.println("ingrese la masa del objeto en kg.");
        m=read.nextDouble();
        System.out.println("ingrese la velocidad del objeto en m/s");
        v=read.nextDouble();
        v*=v;
        ec=m*v/2;
        System.out.println("la energia cinetica de un objeto de masa "+m+" y velocidad "+v+" es de "+ec+" juls.");
        read.close();
    }
}
