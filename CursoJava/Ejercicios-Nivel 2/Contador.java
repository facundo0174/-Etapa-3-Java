//nivel 2 ejercicio 1
/*Contador: Se le solicita que guarde un número en un espacio de memoria e 
incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar 
para hacerlo?  */

import java.util.Scanner;
public class Contador {
    public static void main(String [] args){
        Scanner read=new Scanner(System.in);
        int num;
        System.out.println("escriba el numero a incrementar 20 veces.");
        num=read.nextInt();
        System.out.println("el actual numero es igual a: "+num);
        ++num;++num;++num;++num;++num;
        ++num;++num;++num;++num;++num;
        ++num;++num;++num;++num;++num;
        ++num;++num;++num;++num;++num;
        System.out.println("el incremento final de 20 unidades da como resultado: "+num);
        read.close();
    }
}
