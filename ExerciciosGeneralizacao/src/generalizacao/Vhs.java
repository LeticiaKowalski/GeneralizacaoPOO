package generalizacao;

public class Vhs extends Midia {
	
	private String titulo;

	
	public Vhs() {
		super();
	}
	
	public Vhs(int codigo, String descricao, String gravadora, 
			float duracao, String titulo) {
		super(codigo, descricao, gravadora, duracao);
		setTitulo(titulo);
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo.length() > 0)
			this.titulo = titulo;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nVHS + ");
		builder.append(super.toString());
		builder.append("\n- Título: ");
		builder.append(titulo);
		return builder.toString();
	}
}
