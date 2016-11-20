package ListasEncadeadas;

public class Main {

	public static void main(String[] args) {

		Lista lista = new Lista();
		
		lista.adiciona("Neon");
		lista.adiciona("Tamara");
		lista.adiciona("Roger");
		lista.adiciona("Fabi");
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.remove(2);
		System.out.println(lista);
		

	}

}
