package br.com.provedoraficticia.basicas;

import java.util.Objects;

public class Poste {
    private int id;
    private int conexoesDisponiveis;
    private int conexoesMaximas;

    public Poste(int id, int conexoesDisponiveis, int conexoesMaximas) {
		this.id = id;
		this.conexoesDisponiveis = conexoesDisponiveis;
		this.conexoesMaximas = conexoesMaximas;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poste other = (Poste) obj;
		return id == other.id;
	}


	@Override
	public String toString() {
		return "Poste [id=" + id + ", conexoesDisponiveis=" + conexoesDisponiveis + ", conexoesMaximas="
				+ conexoesMaximas + "]";
	}
}