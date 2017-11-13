package Entity;

import java.util.List;

public class Graph {

    private List<Mot> graph;
    private int nbSommets;
    private int nbAretes;

    public Graph(List<Mot> graph) {
        this.graph = graph;
    }

    public List<Mot> getGraph() {
        return graph;
    }

    public void setGraph(List<Mot> graph) {
        this.graph = graph;
    }

    public int getNbSommets() {
        return graph.size();
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

    /**
     *  Question 4
     * @return
     */
    public int getNbmotsSansVoisins(){
        int compteurSansVoisins = 0;
        for (Mot mot : this.graph){
            if (mot.getVoisins() == null){
                compteurSansVoisins += 1;
            }
        }
        return compteurSansVoisins;
    }
}
    public int getNbSommets() {
        if (graph != null)
    }
            return graph.size();
        else return 0;