/*nivel 2 ejercicio 5
 * Positivos y divisibles por 7 : Realizar un programa que muestre por pantalla los 
números enteros positivos que sean divisibles por 7 y que sean menores que 100. 
 */
public class PositivosDivSiete {
    public static void main(String[] args) {
        System.out.println("los numeros del 0 al 100 divisibles por 7 son los siguientes.");
        for (int i=0;i<100;i++){
            if ((i%7)==0){
                System.out.println(i);
            }
        }
    }
}
