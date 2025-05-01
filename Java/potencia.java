//nivel 1 ejercicio 10
import java.util.Scanner;
public class potencia {
    public static void main (String[] args){
        Scanner read= new Scanner(System.in);
        int num,potencia;
        System.out.println("ingrese el numero a protenciar al cuadrado y al cubo.");
        num=read.nextInt();
        potencia=num*num;
        System.out.println("el cuadrado del numero "+num+" es : "+potencia);
        potencia*=num;
        System.out.println("el cubo del numero "+num+"es igual a: "+potencia);
        read.close();
    }
}
