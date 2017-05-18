import entity.Edge;
import entity.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ms on 18-05-17.
 */
public class Runner {

    List<Node> nodes;
    List<Edge> edges;
    String[] nodeNames = {"A", "B", "C", "D", "E", "F", "G"};

    private void run() {
        initGraph();

        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(nodes.get(0));
        LinkedList<Node> path = dijkstra.getPath(nodes.get(6));
    }

    private void initGraph() {
        nodes = new ArrayList();
        edges = new ArrayList();
        for (int i = 0; i < 7; i++) {
            Node location = new Node("Node_" + i, "Node_" + i);
            nodes.add(location);
        }

        addEdge("Edge_0", 0, 1, 1);
        addEdge("Edge_1", 0, 2, 2);
        addEdge("Edge_2", 0, 3, 3);
        addEdge("Edge_3", 1, 2, 2);
        addEdge("Edge_4", 2, 4, 2);
        addEdge("Edge_5", 3, 4, 4);
        addEdge("Edge_6", 3, 5, 1);
        addEdge("Edge_7", 4, 6, 2);
        addEdge("Edge_8", 5, 6, 3);

        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(nodes.get(0));
        LinkedList<Node> path = dijkstra.getPath(nodes.get(6));

        for (Node node : path) {
            System.out.println(node);
        }
    }

    private void addEdge(String id, int source, int destination, int cost) {
        Edge edge = new Edge(id, nodes.get(source), nodes.get(destination), cost);
        edges.add(edge);
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run();
    }
}
