package br.com.provedoraficticia.basicas;

public class Conexao {
    private int id;
    private double distancia;
    private Poste origem;
    private Poste destino;

    public Conexao(int id, double distancia, Poste origem, Poste destino) {
        this.id = id;
        this.distancia = distancia;
        this.origem = origem;
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public double getDistancia() {
        return distancia;
    }

    public Poste getOrigem() {
        return origem;
    }

    public Poste getDestino() {
        return destino;
    }
    
    public Poste getAdjacencia(Poste poste) {
    	return poste.equals(origem) ? destino: origem;
    } 
}
