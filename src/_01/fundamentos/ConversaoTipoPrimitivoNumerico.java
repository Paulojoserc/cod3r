package _01.fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; //implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888; //explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d =(byte)c;
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e;
		System.out.println(f);
	}
}
