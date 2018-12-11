package entities;

import entities.enums.Alimentacao;

public class Convidado {
	
	private String nome;
	private char bebida;
	private Alimentacao aliment;
	
	public Convidado(String nome, char bebida, Alimentacao aliment) {
		this.nome = nome;
		this.bebida = bebida;
		this.aliment = aliment;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getBebida() {
		return bebida;
	}

	public void setBebida(char bebida) {
		this.bebida = bebida;
	}

	public Alimentacao getAliment() {
		return aliment;
	}

	public void setAliment(Alimentacao aliment) {
		this.aliment = aliment;
	}
	
	

}
