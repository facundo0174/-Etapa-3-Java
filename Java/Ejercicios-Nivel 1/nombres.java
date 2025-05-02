//nivel 1 ejercicio 9
/*Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre 
y apellido, luego guarde su edad e imprimalos por pantalla. 
El mensaje debe tener el siguiente formato:  
“Mi nombre es “ {Nombre} 
“Mi edad es” {Edad}  */
import java.util.Scanner;
public class nombres {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("ingrese su nombre completo.");
        nombre=read.nextLine();
        System.out.println("ingrese su edad.");
        edad=read.nextInt();
        System.out.println("Mi nombre es: "+nombre+"\nMi edad es: "+edad);
        read.close();
    }
}
