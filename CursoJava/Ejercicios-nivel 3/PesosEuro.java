/*Nivel 3 ejercicio 5
 * Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario 
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de 
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario 
ingresa 5000 pesos, el programa deberá mostrar 250 euros.
*/
import java.util.Scanner;
public class PesosEuro {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double TASA_PESOS_EUROS=0.00075;//informacion del 2/5/25
        double pesos;
        System.out.println("Ingrese la cantidad de pesos a convertir.");
        pesos=read.nextDouble();
        System.out.println("Tasa de venta euro actual: "+TASA_PESOS_EUROS+
        "\nCantidad de pesos: "+pesos+"\nCantidad en Euros: "+(pesos*TASA_PESOS_EUROS));
        read.close();
    }
}