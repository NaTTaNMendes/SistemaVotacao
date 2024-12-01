package modelos.factory;

import java.util.Date;

import modelos.Pessoa;

public interface PessoaFactory {
	Pessoa criarPessoa(String nome, Date dataNascimento, String tituloEleitor, String cpf, Integer numeroCandidatura);
}