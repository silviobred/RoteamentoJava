package io.github.jnefoussi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan J Nefoussi
 */
public class Graph {

    private List<Node> nodes = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();

    public Graph() {
        createNodes();
        createEdges();

    }

    public void createNodes() {

        Node nodea = new Node('A');
        Node nodeb = new Node('B');
        Node nodec = new Node('C');
        Node noded = new Node('D');
        Node nodee = new Node('E');

        getNodes().add(nodea);
        getNodes().add(nodeb);
        getNodes().add(nodec);
        getNodes().add(noded);
        getNodes().add(nodee);

    }

    public void printNodes() {
        System.out.println("\nNodes List");
        for (Node node : getNodes()) {
            System.out.print(node.getName() + " ");
        }
        System.out.print("\n\n");
    }

    public void createEdges() {

        Edge edgeAB = new Edge(getNodes().get(0), getNodes().get(1), 2);
        getEdges().add(edgeAB);

        Edge edgeAC = new Edge(getNodes().get(0), getNodes().get(2), 1);
        getEdges().add(edgeAC);

        Edge edgeAE = new Edge(getNodes().get(0), getNodes().get(4), 1);
        getEdges().add(edgeAE);

        Edge edgeBA = new Edge(getNodes().get(1), getNodes().get(0), 2);
        getEdges().add(edgeBA);

        Edge edgeBC = new Edge(getNodes().get(1), getNodes().get(2), 3);
        getEdges().add(edgeBC);

        Edge edgeBD = new Edge(getNodes().get(1), getNodes().get(3), 4);
        getEdges().add(edgeBD);

        Edge edgeBE = new Edge(getNodes().get(1), getNodes().get(4), 3);
        getEdges().add(edgeBE);

        Edge edgeCA = new Edge(getNodes().get(2), getNodes().get(0), 1);
        getEdges().add(edgeCA);

        Edge edgeCB = new Edge(getNodes().get(2), getNodes().get(1), 3);
        getEdges().add(edgeCB);

        Edge edgeCD = new Edge(getNodes().get(2), getNodes().get(3), 2);
        getEdges().add(edgeCD);

        Edge edgeDB = new Edge(getNodes().get(3), getNodes().get(1), 4);
        getEdges().add(edgeDB);

        Edge edgeDC = new Edge(getNodes().get(3), getNodes().get(2), 2);
        getEdges().add(edgeDC);

        Edge edgeDE = new Edge(getNodes().get(3), getNodes().get(4), 1);
        getEdges().add(edgeDE);

        Edge edgeEA = new Edge(getNodes().get(4), getNodes().get(0), 1);
        getEdges().add(edgeEA);

        Edge edgeEB = new Edge(getNodes().get(4), getNodes().get(1), 3);
        getEdges().add(edgeEB);

        Edge edgeED = new Edge(getNodes().get(4), getNodes().get(3), 1);
        getEdges().add(edgeED);

    }

    public void printEdges() {

        System.out.println("\nEdges List");
        for (Edge edge : getEdges()) {
            System.out.println(edge.getSrc().getName() + ">" + edge.getDst().getName() + " | " + edge.getWeight());
        }
        System.out.print("\n\n");

    }

    /**
     * @return the nodes
     */
    public List<Node> getNodes() {
        return nodes;
    }

    /**
     * @param nodes the nodes to set
     */
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    /**
     * @return the edges
     */
    public List<Edge> getEdges() {
        return edges;
    }

    /**
     * @param edges the edges to set
     */
    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

}
