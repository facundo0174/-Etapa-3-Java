/*nivel 4 ejercicio 4 
 * Cálculo de la media aritmética: Escribir un programa en Java que calcule la media 
aritmética de un conjunto de números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) 
 */
public class mediaArimetica {
    public static void main(String[] args){
        int cant=0;
        double valores, media;
        valores=2;
        cant++;
        valores+=4;
        cant++;
        valores+=5;
        cant++;
        valores+=9;
        cant++;
        valores+=13;
        cant++;
        media=valores/cant;
        System.out.println("la media arimetica de los valores dados es igual a: "+media);
    }
}
