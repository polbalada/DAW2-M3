//AUTOR: Pol
public class elsveins {
    static String [] trobaVeins(){
        String v[] = {"Adam","Cora","Erin","Dale","Bill"};
        //String v[] = {"Adam","Bill","Cora","Erin","Dale"};
        // Adam, Bill, Cora, Erin i Dale
        while(!satisfa(v)){
            v = desordenar(v);
        }
        return v;
    }
    static boolean satisfa(String [] v){
        return (!v[4].equals("Adam") && !v[0].equals("Bill") && !v[4].equals("Cora") && !v[0].equals("Cora") && pis(v,"Dale") > pis(v,"Bill")&& pis(v,"Erin")+1 != pis(v,"Cora")&& pis(v,"Erin")-1 != pis(v,"Cora") && pis(v,"Cora")+1!=pis(v,"Bill") && pis(v,"Cora")-1!=pis(v,"Bill") );
    }
    static int pis (String [] v, String vei){
        for (int i=0;i<v.length;i++){
            if (v[i].equals(vei))
                return i;
        }
        return -1;
    }
    static String [] desordenar(String [] v){
        String aux;
        int num=(int)(Math.random()*5);
        int i=(int)(Math.random()*5);
        aux=v[i];
        v[i]=v[num];
        v[num]=aux;
        
        return v;
    }
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(trobaVeins()));
        System.out.println("[Erin, Bill, Adam, Cora, Dale]");
    }

}
