//Nivel 2 ejercicio 5
/*conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en 
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice 
una constante de los valores que no van a cambiar en esta conversión. Muestre el 
resultado por pantalla.*/
import java.util.Scanner;
public class ConversionKg {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        double LIBRA_POR_KG=0.453592;
        double miPesoKg,miPesoLb;
        System.out.println("ingrese su peso en kilogramos (utilice '.' para los decimales)");
        miPesoKg=read.nextDouble();
        miPesoLb=miPesoKg*LIBRA_POR_KG;
        System.out.println("Su peso en libras es igual a: "+miPesoLb);
        read.close();
    }
}
