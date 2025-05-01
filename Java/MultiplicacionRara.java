//nivel 1 ejercicio 11
import java.util.Scanner;
public class MultiplicacionRara {
    public static void main(String[] args ){
        Scanner read = new Scanner(System.in);
        int num1,num2,result;
        result=0;
        System.out.println("ingrese el primer numero a multiplicar.");
        num1=read.nextInt();
        System.out.println("ingrese  el segundo numero.");
        num2=read.nextInt();
        result+=(num1*num2)/1;
        result+=(num1*num2)/2;
        result+=(num1*num2)/3;
        result+=(num1*num2)/4;
        result+=(num1*num2)/5;
        result+=(num1*num2)/6;
        result+=(num1*num2)/7;
        result+=(num1*num2)/8;
        result+=(num1*num2)/9;
        result+=(num1*num2)/10;
        result+=(num1*num2)/11;
        result+=(num1*num2)/12;
        result+=(num1*num2)/13;
        result+=(num1*num2)/14;
        result+=(num1*num2)/15;
        System.out.println("el resultado de la operacion extrania es de: "+result);
        read.close();
    }
}
