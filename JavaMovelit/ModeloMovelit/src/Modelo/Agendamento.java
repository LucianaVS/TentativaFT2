package Modelo;

public class Agendamento {
	
	private int id_agenda;
	private String nome_lugar;
	
	public Agendamento () {
		
	}
	public int getId_agenda() {
		return id_agenda;
	}
	public void setId_agenda(int id_agenda) {
		this.id_agenda = id_agenda;
	}
	public String getNome_lugar() {
		return nome_lugar;
	}
	public void setNome_lugar(String nome_lugar) {
		this.nome_lugar = nome_lugar;
	}
	public Agendamento(int id_agenda, String nome_lugar) {
		super();
		this.id_agenda = id_agenda;
		this.nome_lugar = nome_lugar;
	}
	
}