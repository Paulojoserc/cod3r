package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
public static void main(String[] args) {
	Queue<String> fila = new LinkedList<>();
	
	//Offer e Add -> adicionam elementos na fila
	//Diferença é o comportamento ocorre quando a fila está cheia!
	fila.add("Ana");//retorna false
	fila.offer("Bia");//Lança uma exeção
	fila.offer("Carlos");
	fila.offer("Daniel");
	fila.offer("Rafaela");
	fila.offer("Gui");
	
	
	//Diferença é o comportamento ocorre quando a fila esta vazia!
	//Peek e Element -> obter o próximo elementos na fila
	System.out.println(fila.peek()); //retorna null
	System.out.println(fila.peek());
	System.out.println(fila.element()); //Lança uma exceção
	System.out.println(fila.element());
	
	//Poll e Remove -> obter próximo elemento da fila e remove!
	
	//Diferença é o comportamento ocorre quando a fila está vazia!
	System.out.println(fila.poll());   //retorna nulo quando fila estiver vazia 
	System.out.println(fila.remove()); //retorna uma exceção
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	
	
		//fila.size(); //conta o tamanho da fila 
		//fila.clear();//limpa
		//fila.isEmpty();//Verifica se a fila esta vazia
		//fila.contains(...) // esta ou não contendo 
	
}
}
