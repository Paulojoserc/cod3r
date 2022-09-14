package fundamentos;

public class NotacaoPonto {
public static void main(String[] args) {
	String s = "Bom dia X";
	// este modelo não altera o valor => s.toUpperCase();
	s = s.replace("X", "Senhora"); // altera a palavra
	s = s.toUpperCase(); // Up para ficar tudo em caixa alta
	s = s.concat("!!!"); // funciona como uma soma
	
	System.out.println(s);
	
	String x = "Leo".toUpperCase();
	System.out.println(x);
	
	String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
	System.out.println(y);
}
}
