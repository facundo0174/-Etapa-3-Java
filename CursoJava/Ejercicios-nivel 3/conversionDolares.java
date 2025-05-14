/*Nivel 3 ejercicio 2
 * Conversión de dólares a pesos: Escribir un programa en Java que solicite al 
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una 
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el 
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
 */
import java.util.Scanner;
public class conversionDolares {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double VENTA_DOLAR_PESOS=1091.50;//ultima revision de valor = 26/3/2025 segun BNA
        double dolares;
        System.out.println("Ingrese la cantidad de dolares a vender.");
        dolares=read.nextDouble();
        System.out.println("Tasa de venta dolar actual: "+VENTA_DOLAR_PESOS+
        "\nCantidad de Dolares: "+dolares+"\nCantidad en Pesos Argentinos: "+(dolares*VENTA_DOLAR_PESOS));
        read.close();
    }
}
