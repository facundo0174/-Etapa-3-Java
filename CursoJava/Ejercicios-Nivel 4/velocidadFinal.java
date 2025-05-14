/*nivel 4 ejercicio 6
 *  Cálculo de la velocidad final: 
Escribir un programa en Java que calcule la velocidad final de un objeto en caída 
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo 
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i 
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo 
transcurrido. Muestre el resultado por pantalla.
 */
import java.util.Scanner;
public class velocidadFinal {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        double G=9.810;
        double vf,vi,t;
        System.out.println("ingrese la velocidad inicial del objeto en m/s.");
        vi=read.nextDouble();
        System.out.println("ingrese el tiempo en el cual desea saber la velocidad en segundos.");
        t=read.nextDouble();
        vf=vi+G*t;
        System.out.println("la velocidad final de un objeto con vi = "+vi+"m/s y tiempo transcurrido = "+t+"s es "+vf+"m/s");
        read.close();
    }
}
