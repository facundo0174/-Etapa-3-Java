//nivel 1 ejercicio 9
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
