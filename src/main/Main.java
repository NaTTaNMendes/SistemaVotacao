package main;

import modelos.Pessoa;
import modelos.factory.CandidatoFactory;
import modelos.factory.PessoaFactory;
import modelos.factory.VotanteFactory;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PessoaFactory candidatoFactory = new CandidatoFactory();
        Pessoa candidato = candidatoFactory.criarPessoa(
            "João da Silva",
            new Date(),
            "123456789",
            "98765432100",
            101
        );

        PessoaFactory votanteFactory = new VotanteFactory();
        Pessoa votante = votanteFactory.criarPessoa(
            "Maria Oliveira",
            new Date(),
            "987654321",
            "12345678900",
            null
        );

        System.out.println("Candidato: " + candidato.getNome());
        System.out.println("Votante: " + votante.getNome());
    }
}