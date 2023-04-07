package br.com.provedoraficticia.basicas;

import java.util.ArrayList;
import java.util.List;

public class Poste {
    private int id;
    private int conexoesDisponiveis;
    private int conexoesMaximas;
    private List<Conexao> conexoes;
    private boolean distribuicaoCentral;

    

    public Poste(int id, int conexoesDisponiveis, int conexoesMaximas,
			boolean distribuicaoCentral) {
		this.id = id;
		this.conexoesDisponiveis = conexoesDisponiveis;
		this.conexoesMaximas = conexoesMaximas;
		this.conexoes = new ArrayList<>();
		this.distribuicaoCentral = distribuicaoCentral;
	}

    
	public int getId() {
        return id;
    }

    public int getConexoesDisponiveis() {
        return conexoesDisponiveis;
    }

    public int getConexoesMaximas() {
        return conexoesMaximas;
    }

    public List<Conexao> getConexoes() {
        return conexoes;
    }

    public void addConexao(Conexao conexao) {
        conexoes.add(conexao);
    }
    
    
    public boolean isDistribuicaoCentral() {
		return distribuicaoCentral;
	}


	public void setDistribuicaoCentral(boolean distribuicaoCentral) {
		this.distribuicaoCentral = distribuicaoCentral;
	}


	@Override
	public String toString() {
		return "Poste [id=" + id + ", conexoesDisponiveis=" + conexoesDisponiveis + ", conexoesMaximas="
				+ conexoesMaximas + ", distribuicaoCentral=" + distribuicaoCentral + "]";
	}


	
}