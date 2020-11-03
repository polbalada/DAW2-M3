public class Prova {

	public static String explanada(int n) {
		String cad = "(=)";
		char num = (char)cad.length();
		String letra = "" ;
		for (int m=0; n > m; n--){
			letra += cad.charAt((int)(Math.random()*num));
                        
		}
		return letra;
	}
	public static void main(String[] args) {
		System.out.println(explanada(5));
	}
}