package com.fiap.view;

public class Produto {

	String nome;
	String descricao;
	float valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + "]";
	} 
	//video 4
	
	
}
