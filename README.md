Criação da classe urna; 
	- mostrarVotos(): retorna os votos registrados naquela urna.
	- votar(pessoa, número): registra um voto, recebendo uma pessoa (candidato ou votante) e o número do voto.
	
Refatoração do método votar da classe pessoa:
	- Modificação: fiz retornar um número ao invés de um tipo void.
 	- Motivo: Iria ser complexo trabalhar com urnas dentro de cada objeto pessoa, além de não termos uma centralização dos dados posterioremente.
