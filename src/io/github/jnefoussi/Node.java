package io.github.jnefoussi;

/**
 *
 * @author Jonathan J Nefoussi
 */
public class Node {
    
    private char nome;
    private int peso;
    
    public Node (char nome) {
        this.nome = nome;
        
    }

    /**
     * @return the nome
     */
    public char getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(char nome) {
        this.nome = nome;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
