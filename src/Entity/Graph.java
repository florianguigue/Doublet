package Entity;

import java.util.List;

public class Graph {

    private List<Mot> graph;
    private int nbSommets;
    private int nbAretes;

    public void calcul() {
        setNbSommets();
        setNbAretes();
    }

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
        return this.nbSommets;
    }

    public void setNbSommets() {
        if (this.graph != null) {
            this.nbSommets = graph.size();
        }
    }

    public int getNbAretes() {
        return nbAretes;
    }

    public void setNbAretes() {
        int arete = 0;
        if (graph != null) {
            for (Mot mot : graph) {
                if(mot.getVoisins() != null) {
                    arete += mot.getVoisins().size();
                }
            }
            this.nbAretes = arete / 2;
        }
    }

    /**
     * Question 4
     *
     * @return
     */
    public int getNbmotsSansVoisins() {
        int compteurSansVoisins = 0;
        for (Mot mot : this.graph) {
            if (mot.getVoisins() == null) {
                compteurSansVoisins += 1;
            }
        }
        return compteurSansVoisins;
    }

    /**
     * Question 4
     *
     * @return
     */
    public int nbComposantesConnexes() {
        int compteurComposantesConnexes = 0;
        for (Mot mot : this.graph) {
            if (mot.getVoisins() == null) {
                compteurComposantesConnexes += 1;
            }
        }
        return compteurComposantesConnexes;
    }
}
