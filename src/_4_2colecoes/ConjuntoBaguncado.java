package _4_2colecoes;

import java.util.HashSet;
import java.util.Set;
public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho � "+conjunto.size());
		
		conjunto.add("teste");
		System.out.println("Tamanho � "+conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("X"));
		
		System.out.println("Tamanho � "+conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		
		Set nums  = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.add(nums);//Uni�o entre dois conjuntos
		System.out.println(conjunto);
		conjunto.retainAll(conjunto);// Valoreis em comum entre os 2 conjuntos 
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);

	}

}
