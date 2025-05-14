/*Nivel 3 ejercicio 3 
 * Conversión de euros a dólares: Escribir un programa en Java que solicite al 
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una 
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y 
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
*/
import java.util.Scanner;
public class conversionDolaresEuros {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double TASA_EURO_DOLARES=0.88;//informacion del 2/5/25
        double euros;
        System.out.println("Ingrese la cantidad de euros a vender.");
        euros=read.nextDouble();
        System.out.println("Tasa de venta euro actual: "+TASA_EURO_DOLARES+
        "\nCantidad de EUROS: "+euros+"\nCantidad en Dolares Americanos: "+(euros*TASA_EURO_DOLARES));
        read.close();
    }
}
