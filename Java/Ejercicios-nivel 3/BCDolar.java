/*Nivel 3 ejercicio 6
 * Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al 
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una 
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000 
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares. 
 */
import java.util.Scanner;
public class BCDolar {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double TASA_BC_DOLAR=97013.07;
        double bc;
        System.out.println("ingrese la cantidad de BC a convertir.");
        bc=read.nextDouble();
        System.out.println("Tasa de venta BC actual: "+TASA_BC_DOLAR+
        "\nCantidad de BC: "+bc+"\nCantidad en Dolares Americanos: "+(bc*TASA_BC_DOLAR));
        read.close();
    }
}
