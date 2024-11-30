package modelos;

import java.util.Date;

public class Votante extends Pessoa{

	public Votante(String nome, Date dataNascimento, String tituloEleitor, String cpf) {
		super(nome, dataNascimento, tituloEleitor, cpf);
	}

	@Override
	public void votar(int numero) {
	}

	
}
