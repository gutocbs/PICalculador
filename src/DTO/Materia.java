package DTO;

import java.util.List;

public class Materia {
    private String nomeMateria;
    private String textoMateria;
    private List<String> variaveis;

    public Materia(String nomeMateria, String textoMateria, List<String> variaveis) {
        this.nomeMateria = nomeMateria;
        this.textoMateria = textoMateria;
        this.variaveis = variaveis;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public String getTextoMateria() {
        return textoMateria;
    }

    public List<String> getVariaveis() {
        return variaveis;
    }
}
