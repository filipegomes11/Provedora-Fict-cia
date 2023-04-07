package br.com.provedoraficticia.gui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.provedoraficticia.basicas.Conexao;
import br.com.provedoraficticia.basicas.Grafo;
import br.com.provedoraficticia.basicas.Poste;
import br.com.provedoraficticia.negocio.MenorCaminho;

public class Main {
	public static void main(String[] args) {
//Neste teste, iremos criar postes, arestas e o grafo. Depois iremos testar de fato o algoritmo		
		Poste poste1 = new Poste(1, 0, 2);
		Poste poste2 = new Poste(2, 0, 2);
		Poste poste3 = new Poste(3, 0, 2);
		Poste poste4 = new Poste(4, 2, 2);
		Poste poste5 = new Poste(5, 2, 2);
		Poste poste6 = new Poste(6, 0, 2);

		Conexao aresta1 = new Conexao(1, 10, poste1, poste2);
		Conexao aresta2 = new Conexao(2, 5, poste2, poste3);
		Conexao aresta3 = new Conexao(3, 7, poste3, poste4);
		Conexao aresta4 = new Conexao(4, 12, poste4, poste5);
		Conexao aresta5 = new Conexao(5, 3, poste2, poste4);
		Conexao aresta6 = new Conexao(6, 8, poste3, poste5);
		Conexao aresta7 = new Conexao(7, 8, poste1, poste6);

		// Criação do grafo
		Grafo grafo = new Grafo(new ArrayList<Conexao>(Arrays.asList(aresta1, aresta2, aresta3, aresta4, aresta5, aresta6, aresta7)));

		List<Poste> caminho = MenorCaminho.encontrarMenorCaminho(grafo, poste6);

		for (Poste p : caminho) {
			System.out.println(p);
		}

	}

}
