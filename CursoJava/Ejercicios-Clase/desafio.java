public class desafio {
    public static void main(String[] args) {
        int[] puntosPorMision = {50,34,29,64,89}; 
        int total = 0; 
        int posMax=0;
        int mision75=0;
        int maxPuntosMision=puntosPorMision[0];
        int minPuntosMision=puntosPorMision[0];
        for (int i=1;i<puntosPorMision.length;i++){
            if(puntosPorMision[i]>maxPuntosMision){
                maxPuntosMision=puntosPorMision[i];
                posMax=i;
            }
            if(puntosPorMision[i]<minPuntosMision){
                minPuntosMision=puntosPorMision[i];
            }
        }
        for (int i = 0; i < puntosPorMision.length; i++) { 
            total += puntosPorMision[i]; 
            if(puntosPorMision[i]==0){
                System.out.println("Fallaste al menos una misión. Que el backend te tenga piedad...");
            }
            if (puntosPorMision[i]>75){
                mision75++;
            }
        } 
        System.out.println("RESULTADOS.");
        for(int i=0;i<puntosPorMision.length;i++){
            System.out.print("Mision "+i+"= "+puntosPorMision[i]+" | ");
        }
        System.out.println("");
        System.out.println("El puntaje final es de: "+total);
        if (mision75>0){
            System.out.println("Nivel desbloqueado: Mini Stone Chad" );
        }
        if(total>300){
            System.out.println("Felicidades sos un verdadero Chad del RPG.");
        }else{
            System.out.println("Te falta entranamiento joven aprediz...");
        }
        if((maxPuntosMision-minPuntosMision)<20){
            System.out.println("¡Ejecución constante! Sos el sueño de un arquitecto de software." );
        }
        System.out.println("La mision que mejor rendimiento tuvo es la mision N° "+(posMax+1)+" con "+maxPuntosMision+" puntos");

    } 
}
