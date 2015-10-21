package format;

// main class
public class Main {
	private final static String TRAN_ID_REGEXPR ="(\\d{8})(\\d{4})(\\d{4})(\\d{4})(\\d{12})";
	private final static String TRAN_ID_SUBTITUTIONSTR ="$1-$2-$3-$4-$5";



	//- w





	public static void main(String[] args) {

		String orderId = "122345644478978978978979879879871";

		if (orderId.length()<=33){
		StringBuffer tranId = new StringBuffer(orderId);
		/*
		 * Agrego tantos digitos como sean necesarios para completar un string de 32 caracteres
		 *  
		 */
		for (; tranId.length() < 32;) {
			tranId.insert(0,0);
		
		}
		String tId = tranId.toString().replaceFirst(TRAN_ID_REGEXPR, TRAN_ID_SUBTITUTIONSTR);
		System.out.println(tId);
		System.out.println(tranId);}
	}
}
