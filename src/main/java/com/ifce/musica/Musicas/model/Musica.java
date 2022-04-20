package com.ifce.musica.Musicas.model;

public class Musica {
	
	private String nome;
	private String duracao;
	private String estilo;
	
	public Musica() {
		
	}
	public Musica(String nome, String duracao, String estilo) {
		this.nome = nome;
		this.duracao = duracao;
		this.estilo = estilo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	

}
