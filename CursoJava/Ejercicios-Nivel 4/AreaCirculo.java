/*Nivel 4 ejercicio 1
 * Cálculo del área de un círculo: Escribir un programa en Java que calcule el área 
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se 
resuelve. 
 */
public class AreaCirculo {
    public static void main(String[] args){
        double PI=3.141592653589793;
        double area,radio;
        radio=5;
        area=2*PI*radio*radio;
        System.out.println("el area de un circulo de radio "+radio+" es igual a: "+area);
    }
}
