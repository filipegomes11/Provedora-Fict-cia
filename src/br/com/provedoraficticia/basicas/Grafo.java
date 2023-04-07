package br.com.provedoraficticia.basicas;

import java.util.List;

public class Grafo {
    private List<Poste> postes;
    private List<Conexao> conexoes;
    private Poste origem;

    public Grafo(List<Poste> postes, List<Conexao> conexoes, Poste origem) {
		this.postes = postes;
		this.conexoes = conexoes;
		this.origem = origem;
	}

	public void addPoste(Poste poste) {
        postes.add(poste);
    }

    public void addConexao(Conexao conexao) {
        conexoes.add(conexao);
        conexao.getOrigem().addConexao(conexao);
    }

    public List<Poste> getPostes() {
        return postes;
    }

    public List<Conexao> getConexoes() {
        return conexoes;
    }

	public void setPostes(List<Poste> postes) {
		this.postes = postes;
	}

	public Poste getOrigem() {
		return origem;
	}

	public void setOrigem(Poste origem) {
		this.origem = origem;
	}
}