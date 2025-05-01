//nivel 1 ejercicio 5
import java.util.Scanner;
public class divisibilidad {
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);
        int num1,num2,resultado;
        String condicion;
        System.out.println("ingrese 2 numeros para dividirlos");
        System.out.println("ingrese el primer numero: ");
        num1=read.nextInt();
        System.out.println("ingrese el segundo numero: ");
        num2=read.nextInt();
        resultado=num1+num2;
        condicion=((num1%num2)==0)? "ES DIVISIBLE":"NO ES DIVISIBLE";
        System.out.println(" la suma de los numeros "+num1+" y "+num2+" es igual a: "+resultado+
                        " y ademas "+num1+" "+condicion+" por "+num2+" el resultado de su division entera es: "+(num1/num2));
        read.close();
    }
}
