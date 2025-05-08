/*nivel 1 ejercicio 5
 * La suma de los primeros: Realizar un programa que calcule la suma de los 
primeros N números naturales, donde N es un número entero guardado en memoria.
 */
import java.util.Scanner;
public class SumaNaturales {
    public static void main(String[]args){
        Scanner read=new Scanner (System.in);
        System.out.println("ingrese un numero natural que reprecente una cota superior de los sumandos.");
        int cota=read.nextInt();
        int suma=0;
        for (int i=1; i<cota; i++){
            suma+=i;
        }
        System.out.println("el resultado de la sumatoria de los antecesores de la cota = "+cota+" es igual a: "+suma);
        read.close();   
    }
}
