//AUTOR: Pol
public class Ex2 {
    public static void inicialitzaEdats(int edats[], int nMatriculats){
        for(int i=0;i<nMatriculats;i++){
            edats[i]=(int)(Math.random()*(40-17+1)+17);
        }
    }
    public static void mostraEdats(int edats[], int nMatriculats){
        for(int i=0;i<nMatriculats;i++)
            System.out.println(edats[i]);
    }
    public static int edatMitjana(int edats[], int nMatriculats){
        int sum=0;
        for (int i=0;i<nMatriculats;i++)
            sum+=edats[i];
        return sum/nMatriculats;
    }
    public static int edatMaxima(int edats[], int nMatriculats){
        int max=0;
        for (int i=0;i<nMatriculats;i++)
            if(edats[i]>max)
                max=edats[i];
        return max;
    }
    public static boolean hiHaAlgunMenor(int edats[], int nMatriculats){
        for (int i=0;i<nMatriculats;i++)
            if (edats[i]<18)
                return true;
        return false;

    }
    public static void main(String[] args) {
        int edats[] = new int[40];
        int nMatriculats=10;
        inicialitzaEdats(edats,nMatriculats);
        mostraEdats(edats,nMatriculats);
        System.out.println("Mitjana " + edatMitjana(edats,nMatriculats));
        System.out.println("Maxima " + edatMaxima(edats,nMatriculats));
        System.out.println(hiHaAlgunMenor(edats,nMatriculats));
        
    }

}
