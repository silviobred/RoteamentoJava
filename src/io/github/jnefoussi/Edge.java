package io.github.jnefoussi;

import java.util.List;

/**
 *
 * @author Jonathan J Nefoussi
 */
public class Edge {

    private Node src;
    private Node dst;
    private int weight;

    public Edge(Node src, Node dst, int weight) {

        this.src = src;
        this.dst = dst;
        this.weight = weight;

    }

    /**
     * @return the src
     */
    public Node getSrc() {
        return src;
    }

    /**
     * @param src the src to set
     */
    public void setSrc(Node src) {
        this.src = src;
    }

    /**
     * @return the dst
     */
    public Node getDst() {
        return dst;
    }

    /**
     * @param dst the dst to set
     */
    public void setDst(Node dst) {
        this.dst = dst;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

}
