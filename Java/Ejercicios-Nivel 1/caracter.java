// nivel 1 ejercicio 4
/*Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre 
y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char? */

import java.util.Scanner;
public class caracter {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        char caracter1;
        char caracter2;
        System.out.println("\n ingrese los 2 caracteres a guardar y mostrar:");
        System.out.println("primer caracter: ");
        caracter1=read.nextLine().charAt(0);
        System.out.println("ingrese el segundo caracter");
        caracter2=read.nextLine().charAt(0);
        System.out.println("los caracteres ingresados son: "+caracter1+" y "+caracter2);
        read.close();
    }
}
// los caracteres se declaran en comillas simples debido a una sintaxis propia de java ya que este lo reserva para strings