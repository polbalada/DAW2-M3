
import java.util.Arrays;
import java.util.List;

//AUTOR: Pol
public class Fotografia {
    private int nCopia;
    private String autor;
    private int any;
    private List temes;
    
    private static List<String> tema1 = Arrays.asList(new String[]{"Exili", "Misèria", "Gana"});
    private static List<String> tema2 = Arrays.asList(new String[]{"Front", "Guerra", "Ferits"});
    private static List<String> tema3 = Arrays.asList(new String[]{"Presó", "Exili", "Misèria"});
    
    public Fotografia(int nCopia, String autor, int any, int temes) {
        this.nCopia = nCopia;
        this.autor = autor;
        this.any = any;
        if (temes==1)
            this.temes = tema1;
        else if (temes==2)
            this.temes = tema2;
        else
            this.temes = tema3;
    }

    public List getTemes() {
        return temes;
    }

    @Override
    public String toString() {
        return "Fotografia{" + "nCopia=" + nCopia + ", autor=" + autor + ", any=" + any + ", temes=" + temes + '}';
    }
    
    
}
