package io.github.jnefoussi;

/**
 *
 * @author Jonathan J Nefoussi
 */
public class Node {
    
    private char name;
    private int peso;
    
    public Node (char name) {
        this.name = name;
        
    }

    /**
     * @return the name
     */
    public char getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(char name) {
        this.name = name;
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
