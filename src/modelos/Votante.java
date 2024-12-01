package modelos;

import java.util.Date;

public class Votante extends Pessoa{

	public Votante(String nome, Date dataNascimento, String tituloEleitor, String cpf) {
		super(nome, dataNascimento, tituloEleitor, cpf);
	}

	@Override
	public int votar(int numero) {
		return numero;
	}

	
}
