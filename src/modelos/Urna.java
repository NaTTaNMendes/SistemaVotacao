package modelos;

import java.util.ArrayList;
import java.util.List;

public class Urna {
	private List<Integer> votos = new ArrayList<Integer>();
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void votar(int numeroCandidato, Pessoa pessoa) {
		pessoas.add(pessoa);
		votos.add(numeroCandidato);
	}

	//metodo teste para ver se 
	//esta computando os votos direitinho!
	public void mostrarVotos() {
		for (Integer votos : votos) {
			System.out.println(votos.toString());
		}
	}
}
