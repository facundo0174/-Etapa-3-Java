//nivle 1 ejercicio 1 version 2
import java.util.Scanner; // paquete que te permite hacer un analogo a readln de la terminal
public class escanear {
    public static void main (String[] arg){
        Scanner readln = new Scanner(System.in); //objeto readln de la clase scanner que se usara para "leer" entradas 
        System.out.println("ingrese 2 numeros para realizar la suma");
        int num1 = readln.nextInt();
        int num2 = readln.nextInt();
        System.out.println("la suma entre los numeros ingresados es la siguiente: "+num1+"+"+num2+"="+(num1+num2));
        readln.close(); // si o si se debe cerrar al terminar para liberar memoria        
    }
}
/*
    observaciones
        el objeto scanner tiene maneras para asegurar el tipo de dato ingresado:
            + readln.nexInt() para enteros
            + readln.nexLine() para strings o cadenas de texto
            + readln.nexDouble() para dobles 
            + readln.nexFloat() para flotantes
            + readln.nextLine().charAt(0) para los caracteres
 */
