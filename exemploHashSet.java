package colecoes;

import java.util.HashSet;

public class exemploHashSet {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet<>();
		
		conjunto.add(1.2);
		conjunto.add('x');
		conjunto.add("Teste");
		conjunto.add(4);
		
		System.out.println(conjunto);
		
		conjunto.remove(4);
		
		System.out.println(conjunto);
		
		HashSet conjunto2 = new HashSet<>();
		
		conjunto2.add(1.2);
		conjunto2.add('y');
		conjunto2.add("teste");
		conjunto2.add(4);
		


		System.out.println(conjunto2);

//		conjunto.retainAll(conjunto2); //retendo no conjunto 1 o que está no cojunto 2 (interseção)
		
		conjunto.addAll(conjunto2);	// unindo os 2 conjuntos
		System.out.println(conjunto);
	}				

}
