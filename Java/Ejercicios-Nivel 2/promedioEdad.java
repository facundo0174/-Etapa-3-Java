// nivel 2 ejercicio 4
/*Promedio de edad: Guarde en diferentes espacios de memoria distintos valores de 
edad y los nombres de esas personas, luego saque su promedio e imprima por 
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus 
edades. */
import java.util.Scanner;
public class promedioEdad {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String nom1,nom2;
        int edad1,edad2;
        System.out.println("ingrese el nombre de la primera persona.");
        nom1=read.nextLine();
        System.out.println("ingrese la edad.");
        edad1=read.nextInt();
        read.nextLine(); // para que no tome el "enter" y se salte lineas de codigo
        System.out.println("ingrese el nombre de la segunda persona.");
        nom2=read.nextLine();
        System.out.println("ingrese la edad.");
        edad2=read.nextInt();
        System.out.println("Sujeto 1: "+nom1+" Edad: "+edad1+"\nSujeto 2: "+nom2+" Edad: "+edad2+
                            "\nEdad Promedio = "+((edad1+edad2)/2));
        read.close();
    }
}
