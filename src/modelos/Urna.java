package modelos;

import java.util.HashMap;
import java.util.Map;

public class Urna {
	private static Urna urna = new Urna();
	private Map<Integer, Integer> votos = new HashMap<Integer, Integer>();

	private Urna() {
	}

	public static Urna getInstance() {
		return urna;
	}

	public void cadastrarCandidato(Pessoa candidato) {
		if (candidato == null)
			throw new IllegalArgumentException("Candidato nulo");
		if (candidato instanceof Candidato) {
			votos.put(((Candidato) candidato).getNumeroCandidatura(), 0);
		}
	}

	public void votar(Integer numeroCandidato) {
		if (!votos.containsKey(numeroCandidato))
			throw new IllegalArgumentException("Candidato inexistente");

		votos.put(numeroCandidato, (votos.get(numeroCandidato) + 1));
	}

	public Map<Integer, Integer> getVotos() {
		return this.votos;
	}

	public Integer calcularGanhador() {
		if (votos.isEmpty()) {
			System.out.println("Nenhum candidato foi cadastrado ou nenhum voto foi registrado.");
		}
		
		Integer numeroGanhador = null;
		int maxVotos = -1;
		for (Map.Entry<Integer, Integer> entrada : votos.entrySet()) {
			Integer numeroCandidato = entrada.getKey();
			Integer quantidadeVotos = entrada.getValue();
			if (quantidadeVotos > maxVotos) {
				maxVotos = quantidadeVotos;
				numeroGanhador = numeroCandidato;
			}
		}
		return numeroGanhador; 
	}
}