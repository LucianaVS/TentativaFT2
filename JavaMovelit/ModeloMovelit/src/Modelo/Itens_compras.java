package Modelo;

public class Itens_compra {
	
	private int_item;
	private int quantidade;
	
	private Locais locais;
	private Compras compras;
	
	public Itens_compra () {
		
	}
	
	public Itens_compra(int quantidade, Locais locais, Compras compras) {
		super();
		this.quantidade = quantidade;
		this.locais = locais;
		this.compras = compras;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Locais getLocais() {
		return locais;
	}

	public void setLocais(Locais locais) {
		this.locais = locais;
	}

	public Compras getCompras() {
		return compras;
	}

	public void setCompras(Compras compras) {
		this.compras = compras;
	}
	
}