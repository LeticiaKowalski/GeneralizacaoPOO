package generalizacao;

public class ItemPrincipal {

	public static void main(String[] args) {
		
		Item i = new Item(1111, "Livro");
		System.out.println(i);
		
		Livro l = new Livro(2222, "Livro", "Machado de Assis");
		System.out.println(l);
		System.out.println("\n");
		
		Midia m = new Midia(3333, "Mídia", "Sony Music", 5);
		System.out.println(m);
		
		Cd cd = new Cd(4444, "Mídia", "Sony Music", 10, 20, "José Bezerra", "Songs");
		System.out.println(cd);
		
		Vhs vhs = new Vhs(5555, "Mídia", "Sony Music", 10, "Songs");
		System.out.println(vhs);
		
	}

}
