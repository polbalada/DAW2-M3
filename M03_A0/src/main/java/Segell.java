
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;

//AUTOR: Pol
public class Segell {
    final public static double DEFAULT_VALUE = 0;
    /*MALAMENTE TRA TRA
    public static LocalDate DEFAULT_DATE = LocalDate.now();*/

    private double valor;
    private LocalDate data;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.data);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Segell other = (Segell) obj;
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    public Segell(double valor, LocalDate data) {
        /*Millor comprovar amb el set
        //if ( valor < 0 ) throw new IllegalArgumentException("Valor negatiu");*/
        if ( data == null ) throw new IllegalArgumentException("Data NULL");
        setValor(valor);
        this.data = data;
    }

    public Segell() {
        this(DEFAULT_VALUE,null);
    }

    @Override
    public String toString() {
        return "Segells{" + "valor=" + valor + ", data=" + data + '}';
    }
    
    public static void main(String[] args){
        try{
            Segell s1 = new Segell(100, LocalDate.now());
            Segell s2 = new Segell(10, LocalDate.of(2001, Month.JANUARY, 1));
            System.out.println(s1);
            System.out.println(s2);
        }catch(Exception e){
            
        }
        try{
            Segell s3 = new Segell(10, LocalDate.of(2001, Month.FEBRUARY, 30));
        }catch (DateTimeException e){
            System.out.println(e.getMessage());
            
            
        }
        
        //System.out.println(s3);
    }

    public void setValor(double valor) {
        if ( valor < 0 ) throw new IllegalArgumentException("Valor negatiu");
        this.valor = valor;
    }

}
