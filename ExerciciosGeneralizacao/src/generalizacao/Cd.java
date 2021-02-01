package generalizacao;

public class Cd extends Midia {
	
	private int faixas;
	private String artista;
	private String album;
	
	
	public Cd() {
		super();
	}
	
	public Cd(int codigo, String descricao, String gravadora, float duracao,
			int faixas, String artista, String album) {
		super(codigo, descricao, gravadora, duracao);
		setArtista(artista);
		setAlbum(album);
	}
	
	
	public int getFaixas() {
		return faixas;
	}
	
	public void setFaixas(int faixas) {
		if (faixas > 0)
			this.faixas = faixas;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		if (artista.length() > 0)
			this.artista = artista;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		if (album.length() > 0)
			this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCD + ");
		builder.append(super.toString());
		builder.append("\n- Faixas: ");
		builder.append(faixas);
		builder.append("\n- Artista: ");
		builder.append(artista);
		builder.append("\n- Álbum: ");
		builder.append(album);
		return builder.toString();
	}
}
