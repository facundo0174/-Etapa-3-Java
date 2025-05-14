//nivel 2 ejercicio 3
/*Caracteres: Guarde en distintos espacios de memoria los caracteres de su nombre 
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char? 
¿Qué es unicode? 
 */
public class Caracteres {
    public static void main(String[] args){
        char l1='\u0046';
        char l2='\u0061';
        char l3='\u0063';
        char l4='\u0075';
        char l5='\u006E';
        char l6='\u0064';
        char l7='\u006F';
        System.out.print(" mi nombre es el siguiente: ");
        System.out.println(""+l1+l2+l3+l4+l5+l6+l7);
    }
}
