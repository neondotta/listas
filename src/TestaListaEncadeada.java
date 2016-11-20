
public class TestaListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		
		lista.append("Rafael");
		lista.append("Ivonei");
		lista.pushFront("Antonio");

		Iterador<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.println( iterator.next() );
		}
		System.out.println(" ========== ** ========== ");
		iterator = lista.iterator();
		iterator.next();
		iterator.insert("Segundo");
		lista.pushFront("Primeiro");
		iterator.next();
		iterator.append("NOVO NODE");

		while (iterator.hasNext()) { iterator.next(); }
		iterator.append("Penultimo");

		lista.append("Ultimo");
		
		for (String s : lista) {
			System.out.println( s );
		}
		
		System.out.println(" ========== ** ========== ");
		iterator = lista.iterator();

		iterator.next();
		iterator.remove();
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.next();
		iterator.remove();
		while (iterator.hasNext()) { iterator.next(); }
		iterator.remove();

		for (String s : lista) {
			System.out.println( s );
		}
		System.out.println(" ========== ** ========== ");
		lista = new ListaEncadeada<>();
		lista.append("Vai morrer...");
		for (String s : lista) {
			System.out.println( s );
		}
		iterator = lista.iterator();
		iterator.next();
		iterator.remove();
		System.out.println("Nao pode imprimir mais nada...");
		for (String s : lista) {
			System.out.println( s );
		}

}

}
