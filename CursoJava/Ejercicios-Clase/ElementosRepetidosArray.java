/*dado un arreglo con elementos repetidos, contabilizar aquellos que no lo hacen y devolver uno corregido 1,1,2,5,3,7,-1,-1,-2,4,5,8,10,22,22,0*/
public class ElementosRepetidosArray {
    public static void main(String[] args) {
        int[] arregloRepetido={1, 2, 3, 3, 2, 2, 0, -1, -1,-4,-3,-5,-1,-3,-5,2,4,5,2,11,1,1};
        Integer[] arregloFinal=new Integer[arregloRepetido.length];
        int numerosNoRepetidos=0;
        boolean seRepite,faltaCopiar;
        int k=0;
        for (int i=0; i<arregloRepetido.length;i++){
            seRepite=false;
            faltaCopiar=true;
            for(int j=0;j<arregloRepetido.length;j++){
                if (i != j && arregloRepetido[i]==arregloRepetido[j]){
                    seRepite=true;
                    break;
                }
            }
            if (!seRepite){
                numerosNoRepetidos++;
            }
            for (int j=0;j<arregloRepetido.length;j++){
                if (arregloFinal[j]!=null){
                    if(arregloRepetido[i]==arregloFinal[j]){
                        faltaCopiar=false;
                        break;
                    }
                }
            }
            if (faltaCopiar){
                arregloFinal[k]=arregloRepetido[i];
                k++;
            }
        }
        System.out.println("en el arreglo orinal, existen "+numerosNoRepetidos+ " elementos que no poseen duplicados");
        System.out.println("el arreglo corregido de estos duplicados es el siguiente:");
        for (int i=0;i<arregloFinal.length;i++){
            System.out.print("|"+arregloFinal[i]+"|");
        }
    }
}
    
    
