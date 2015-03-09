package io.github.jnefoussi;

import java.util.List;

/**
 *
 * @author Jonathan J Nefoussi
 */
public class Edge {
    
    Node src;
    List <Node> dst;
    
    public Edge (Node src, List <Node> dst) {
        
        this.src = src;
        this.dst = dst;
        
    }

}
