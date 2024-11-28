package modelos;

import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private Date dataNascimento;
	private String tituloEleitor;
	private String cpf;

	public Pessoa(String nome, Date dataNascimento, String tituloEleitor, String cpf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.tituloEleitor = tituloEleitor;
		this.cpf = cpf;
	}

	public abstract void votar(int numero);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTituloEleitor() {
		return tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}