import entity.Edge;
import entity.Node;

import java.util.List;

/**
 * Created by ms on 18-05-17.
 */
public class Graph {

    private List<Node> nodes;
    private List<Edge> edges;

    public Graph(List<Node> nodes, List<Edge> edges) {
        this.nodes = nodes;
        this.edges = edges;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }
}
