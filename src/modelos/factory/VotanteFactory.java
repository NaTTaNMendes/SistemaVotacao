package modelos.factory;

import java.util.Date;

import modelos.Pessoa;
import modelos.Votante;

public class VotanteFactory implements PessoaFactory {

    @Override
    public Pessoa criarPessoa(String nome, Date dataNascimento, String tituloEleitor, String cpf, Integer numeroCandidatura) {
        return new Votante(nome, dataNascimento, tituloEleitor, cpf);
    }
}