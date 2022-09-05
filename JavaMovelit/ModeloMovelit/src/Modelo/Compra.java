package Modelo;

	import java.util.ArrayList;
	import java.util.List;
	
	public class Compras {
		
		private int id_compra;
		private String data_compra;
		private double valor_compra;
		
		private Usuarios usuarios;
		private List<Itens_Compra> itens = new ArrayList<Itens_Compra>();
		
		public Compras () {
			
		}
		
		public Compras(int id_compra, String data_compra, double valor_compra, Usuarios usuarios,
				List<Itens_Compra> itens) {
			super();
			this.id_compra = id_compra;
			this.data_compra = data_compra;
			this.valor_compra = valor_compra;
			this.usuarios = usuarios;
			this.itens = itens;
		}

		public int getId_compra() {
			return id_compra;
		}

		public void setId_compra(int id_compra) {
			this.id_compra = id_compra;
		}

		public String getData_compra() {
			return data_compra;
		}

		public void setData_compra(String data_compra) {
			this.data_compra = data_compra;
		}

		public double getValor_compra() {
			return valor_compra;
		}

		public void setValor_compra(double valor_compra) {
			this.valor_compra = valor_compra;
		}

		public Usuarios getUsuarios() {
			return usuarios;
		}

		public void setUsuarios(Usuarios usuarios) {
			this.usuarios = usuarios;
		}

		public List<Itens_Compra> getItens() {
			return itens;
		}

		public void setItens(List<Itens_Compra> itens) {
			this.itens = itens;
		}
		
		
	}