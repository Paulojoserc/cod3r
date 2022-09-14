package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {
	Queue<String> fila = new LinkedList<>();
	
	//Offer e Add -> adicionam elementos na fila
	//Diferen�a � o comportamento ocorre quando a fila est� cheia!
	fila.add("Ana");//retorna false
	fila.offer("Bia");//Lan�a uma exe��o
	fila.offer("Carlos");
	fila.offer("Daniel");
	fila.offer("Rafaela");
	fila.offer("Gui");
	
	
	//Diferen�a � o comportamento ocorre quando a fila esta vazia!
	//Peek e Element -> obter o pr�ximo elementos na fila
	System.out.println(fila.peek()); //retorna null
	System.out.println(fila.peek());
	System.out.println(fila.element()); //Lan�a uma exce��o
	System.out.println(fila.element());
	
	//Poll e Remove -> obter pr�ximo elemento da fila e remove!
	
	//Diferen�a � o comportamento ocorre quando a fila est� vazia!
	System.out.println(fila.poll());   //retorna nulo quando fila estiver vazia 
	System.out.println(fila.remove()); //retorna uma exce��o
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	
	
		//fila.size(); //conta o tamanho da fila 
		//fila.clear();//limpa
		//fila.isEmpty();//Verifica se a fila esta vazia
		//fila.contains(...) // esta ou n�o contendo 
	
}
}
