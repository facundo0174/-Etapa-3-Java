/*Nivel 4 ejercicio 2
 * Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en 
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar 
la fórmula con la que se resuelve. 
 */
import java.util.Scanner;
public class FarenheidGrados {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        double Fahrenheit,Celcius;
        System.out.println("ingrese la temperatura en celcius a convertir.");
        Celcius=read.nextDouble();
        Fahrenheit=Celcius*9/5+32;
        System.out.println("la temperatura en grados fahrenheit es igual a: "+Fahrenheit);
        read.close();
    }
}
