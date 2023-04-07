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
		Poste poste1 = new Poste(1, 2, 2, true);
		Poste poste2 = new Poste(2, 2, 2, false);
		Poste poste3 = new Poste(3, 2, 2, false);
		Poste poste4 = new Poste(4, 2, 2, false);
		Poste poste5 = new Poste(5, 2, 2, false);

		Conexao aresta1 = new Conexao(1, 10, poste1, poste2);
		Conexao aresta2 = new Conexao(2, 5, poste2, poste3);
		Conexao aresta3 = new Conexao(3, 7, poste3, poste4);
		Conexao aresta4 = new Conexao(4, 12, poste4, poste5);
		Conexao aresta5 = new Conexao(5, 3, poste2, poste4);
		Conexao aresta6 = new Conexao(6, 8, poste3, poste5);

		poste1.addConexao(aresta1);
		poste2.addConexao(aresta1);
		poste2.addConexao(aresta2);
		poste2.addConexao(aresta5);
		poste3.addConexao(aresta2);
		poste3.addConexao(aresta3);
		poste3.addConexao(aresta6);
		poste4.addConexao(aresta3);
		poste4.addConexao(aresta4);
		poste4.addConexao(aresta5);
		poste5.addConexao(aresta4);
		poste5.addConexao(aresta6);

		// Criação do grafo
		Grafo grafo = new Grafo( new ArrayList<Poste>(Arrays.asList(poste1,poste2, poste3, poste4, poste5)),
				new ArrayList<Conexao>(Arrays.asList(aresta1, aresta2, aresta3, aresta4, aresta5)), poste1);

		List<Poste> caminho = MenorCaminho.encontrarMenorCaminho(grafo, poste5);

		for(Poste p : caminho) {
			System.out.println(p);
		}
		
		

	}

}
