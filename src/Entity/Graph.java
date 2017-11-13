package Entity;

import java.util.List;

public class Graph {

    private List<Mot> graph;
    private int nbSommets;
    private int nbAretes;

    public List<Mot> getGraph() {
        return graph;
    }

    public void setGraph(List<Mot> graph) {
        this.graph = graph;
    }

    public int getNbSommets() {
        if (graph != null)
            return graph.size();
        else return 0;
    }

    public void setNbSommets(int nbSommets) {
        this.nbSommets = nbSommets;
    }

    public int getNbAretes() {
        return nbAretes;
    }

    public void setNbAretes(int nbAretes) {
        this.nbAretes = nbAretes;
    }
}
