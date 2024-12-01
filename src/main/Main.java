package main;

import java.util.Date;

import modelos.Candidato;
import modelos.Urna;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("Iniciando projeto");
		Urna urna = new Urna();

		Candidato candidato = new Candidato("João", new Date(1985 - 1900, 4 - 1, 15), "1231235", "14013149977", 12345);
		Candidato candidato2 = new Candidato("Cleber", new Date(1985 - 1900, 4 - 1, 15), "1231235", "14013149977", 56789);
		
		urna.votar(candidato.votar(12345), candidato);
		urna.votar(candidato2.votar(56789), candidato2);

		urna.mostrarVotos();
	}
}
