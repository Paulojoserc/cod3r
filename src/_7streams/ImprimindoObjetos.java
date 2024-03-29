package _7streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
public static void main(String[] args) {
	List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
	System.out.println("Usando for tradicional");
	for (int i = 0; i< aprovados.size(); i++) {
		System.out.println(aprovados.get(i));
	}
	
	System.out.println("\nUsando o foreach...");
	for(String nome: aprovados) {
		System.out.println(nome);
	}
	System.out.println("\nUsando Iterator...");
	Iterator<String> iterator = aprovados.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("\nUsando Stream");
	Stream<String> sttream = aprovados.stream();
	sttream.forEach(System.out::println);// La�o interno
}
}
