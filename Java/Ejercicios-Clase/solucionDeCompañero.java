public class solucionDeCompañero {
    public static void main(String[] args) {
        int[] arregloConRepetidos = { 1, 2, 3, 3, 2, 2, 0, -1, -1,-4,-3,-5,-1,-3,-5,2,4,5,2,11,1,1 };
        Integer[] temporal = new Integer[arregloConRepetidos.length];
        int contador = 0;
        for (int i = 0; i < arregloConRepetidos.length; i++) {
            for (int j = 0; j < temporal.length; j++) {
                if (temporal[j]!=null &&arregloConRepetidos[i] == temporal[j]) {
                    break;
                } else if (temporal[j] == null) {
                    temporal[j] = arregloConRepetidos[i];
                    contador++;
                    break;
                }
            }
        }
        int arregloSinRepetidos[] = new int[contador];
        for (int i = 0; i < contador; i++) {
            arregloSinRepetidos[i] = temporal[i];
        }
        System.out.println("El arreglo con repetidos es: " );
        for (int elemento : arregloConRepetidos) {
            System.out.print(elemento + ", ");
        }
        System.out.println("\nDe un total de "+ arregloConRepetidos.length+" elementos en el arreglo original, se han encontrado "+contador+" elementos que no se repiten." );
        System.out.println("El arreglo sin repetidos es: ");
        for (int elemento : arregloSinRepetidos) {
            System.out.print(elemento + ", ");
        }
    }
    
}
