// nivel 1 ejercicio 2 y 3 en simultaneo
import java.util.Scanner;
public class paridad {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        int num1,num2,suma;
        String paridad;
        System.out.println("\ningrese 2 numeros a sumar");
        System.out.print("primer numero: ");
        num1=read.nextInt();
        System.out.print("\ningrese el segundo numero: ");
        num2=read.nextInt();
        suma = num1 + num2;
        paridad=((suma %2)>0)? "IMPAR":"PAR";
        System.out.println("\nel resultado de sumar "+num1+" con "+num2+" es igual a "+suma+" y este resultado es: "+paridad);
        read.close();
    }
}
