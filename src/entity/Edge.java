package entity;

/**
 * Created by ms on 18-05-17.
 */
public class Edge {

    private String id;
    private Node source;
    private Node destination;
    private int cost;

    public Edge(String id, Node source, Node destination, int cost) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }

    public Node getSource() {
        return source;
    }

    public Node getDestination() {
        return destination;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return source + " " + destination;
    }

}
