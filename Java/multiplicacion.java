// nivel 1 ejercicio 8
import java.util.Scanner;
public class multiplicacion {
    public static void main(String[] arg){
        Scanner read = new Scanner(System.in);
        double num1, num2, suma;
        int num3, num4;
        System.out.println("ingreso de los numeros a operacionar:");
        System.out.println("ingrese un real.(usa . para los decimales)");
        num1=read.nextDouble();
        System.out.println("ingrese un real.(usa . para los decimales)");
        num2=read.nextDouble();
        System.out.println("\nel resultado de multiplicar los numeros reales anteriores es de: "+num1+" X "+num2+" = "
                            +(num1*num2));
        System.out.println("ingrese un entero.");
        num3=read.nextInt();
        System.out.println("ingrese un entero.");
        num4=read.nextInt();
        System.out.println("el resultado de multiplicar los numeros reales anteriores es de: "+num3+" X "+num4+" = "
                            +(num3*num4));
        suma=(num1*num2)+(num3*num4);
        System.out.println("\nla suma entre las multiplicaciones es de: "+suma);
        System.out.println("\njava siempre intentara por defecto forsar el tipo de dato de la operacion entre tipos de datos, al que posera\n mayor presicion, a no ser de que se lo indique lo contrario. ejemplo reduccion/ redondear forsosamente el resultado");
        read.close();
    }
}
/*java siempre intentara por defecto "forsar" el tipo de dato de la operacion entre tipos de datos, al que posera
mayor presicion, a no ser de que se lo indique lo contrario. ejemplo reduccion/ redondear forsosamente el resultado*/ 

