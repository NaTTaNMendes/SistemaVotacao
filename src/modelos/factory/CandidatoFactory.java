package modelos.factory;

import java.util.Date;

import modelos.Candidato;
import modelos.Pessoa;

public class CandidatoFactory implements PessoaFactory {

    @Override
    public Pessoa criarPessoa(String nome, Date dataNascimento, String tituloEleitor, String cpf, Integer numeroCandidatura) {
        if (numeroCandidatura == null) {
            throw new IllegalArgumentException("Número de candidatura é obrigatório para criar um Candidato.");
        }
        return new Candidato(nome, dataNascimento, tituloEleitor, cpf, numeroCandidatura);
    }
}