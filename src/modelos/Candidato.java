package modelos;

import java.util.Date;

public class Candidato extends Pessoa implements Voto {
	private int numeroCandidatura;
	
	public Candidato(String nome, Date dataNascimento, String tituloEleitor, String cpf, int numeroCandidatura) {
		super(nome, dataNascimento, tituloEleitor, cpf);
		this.numeroCandidatura = numeroCandidatura;
	}

	public int getNumeroCandidatura() {
		return numeroCandidatura;
	}

	public void setNumeroCandidatura(int numeroCandidatura) {
		this.numeroCandidatura = numeroCandidatura;
	}

	@Override
	public void votar(int numeroCandidato) {
		Urna.getInstance().votar(numeroCandidato);
	}
	
}
