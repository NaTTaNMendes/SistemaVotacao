package main;

import modelos.Candidato;
import modelos.Pessoa;
import modelos.Urna;
import modelos.Votante;
import modelos.factory.CandidatoFactory;
import modelos.factory.PessoaFactory;
import modelos.factory.VotanteFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {

	public static List<Pessoa> gerarCandidatos() {
		PessoaFactory candidatoFactory = new CandidatoFactory();
		List<Pessoa> candidatos = new ArrayList<>();

		// Adiciona alguns candidatos
		candidatos.add(candidatoFactory.criarPessoa("João da Silva", new Date(), "123456789", "98765432100", 101));
		candidatos.add(candidatoFactory.criarPessoa("Ana Pereira", new Date(), "123456780", "98765432101", 102));
		candidatos.add(candidatoFactory.criarPessoa("Carlos Santos", new Date(), "123456781", "98765432102", 103));

		return candidatos;
	}

	public static List<Pessoa> gerarVotantes() {
		PessoaFactory votanteFactory = new VotanteFactory();
		List<Pessoa> votantes = new ArrayList<>();

		// Adiciona alguns votantes
		votantes.add(votanteFactory.criarPessoa("Maria Oliveira", new Date(), "987654321", "12345678900", null));
		votantes.add(votanteFactory.criarPessoa("Pedro Alves", new Date(), "987654322", "12345678901", null));
		votantes.add(votanteFactory.criarPessoa("Luciana Martins", new Date(), "987654323", "12345678902", null));

		return votantes;
	}

	public static void main(String[] args) {
		List<Pessoa> candidatos = gerarCandidatos();

		List<Pessoa> votantes = gerarVotantes();

		for (Pessoa pessoa : candidatos) {
			Urna.getInstance().cadastrarCandidato(pessoa);
		}

		for (Pessoa pessoa : votantes) {
			try {
				((Votante) pessoa).votar(103);
			} catch (Exception e) {
				System.out.println("Candidato não existente, voto não contabilizado.");
			}

		}

		int numeroGanhador = Urna.getInstance().calcularGanhador();
		String nomeGanhador = null;

		for (Pessoa pessoa : candidatos) {
			if (((Candidato) pessoa).getNumeroCandidatura() == numeroGanhador) {
				nomeGanhador = pessoa.getNome();
				break;
			}
		}

		for (Pessoa pessoa : candidatos) {
			if (pessoa instanceof Candidato) {
				System.out.println(((Candidato) pessoa).getNumeroCandidatura() + ": " 
						+ ((Candidato) pessoa).getNome()
						+ ", Votos: " + Urna.getInstance().getVotos().get(((Candidato) pessoa).getNumeroCandidatura()));
			}
		}

		System.out.println("Ganhador: " + nomeGanhador);
	}
}