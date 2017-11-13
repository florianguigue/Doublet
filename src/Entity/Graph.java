package Entity;

import java.util.*;

public class Graph {

    private List<Mot> listMot;
    private Map<Mot, List<Mot>> graph;
    private int nbSommets;
    private int nbAretes;

    public void calcul() {
        setNbSommets();
        setNbAretes();
    }

    public Graph(Map<Mot, List<Mot>> graph, List<Mot> motList) {
        this.graph = graph;
        this.listMot = motList;
    }

    public List<Mot> getListMot() {
        return listMot;
    }

    public void setListMot(List<Mot> listMot) {
        this.listMot = listMot;
    }

    public Map<Mot, List<Mot>> getGraph() {
        return graph;
    }

    public void setGraph(Map<Mot, List<Mot>> graph) {
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
            for (int i = 0; i < graph.size(); i++) {
                arete += this.graph.get(listMot.get(i)).size();
            }
        }
        this.nbAretes = arete / 2;
    }

    /**
     * Question 4
     *
     * @return
     */
    public int getNbmotsSansVoisins() {
        int compteurSansVoisins = 0;
        for (int i = 0; i < graph.size(); i++) {
            if (graph.get(listMot.get(i)).size() == 0) {
                compteurSansVoisins += 1;
            }
        }
        return compteurSansVoisins;
    }

    /**
     * Question 3
     *
     * @return
     */
    public int nbComposantesConnexes() {
        int compteurComposantesConnexes = 0;
        Stack<Mot> pile = new Stack<>();
        Mot current = null;
        for (Mot mot : listMot) {
            mot.setMarque(false);
        }
        for (Mot m : listMot) {
            if (!m.isMarque()) {
                pile.push(m);
                pile.peek().setMarque(true);
                while (pile.size() > 0) {
                    current = pile.pop();
                    for (Mot voisin : graph.get(current)) {
                        if (!voisin.isMarque()) {
                            voisin.setMarque(true);
                            pile.push(voisin);
                        }
                    }
                }
                compteurComposantesConnexes++;
            }
        }
        return compteurComposantesConnexes;
    }

    /**
     *  Question 6
     * @param k
     * @return
     */
    public int sommetWithKSommets(int k) {
        int compteur = 0;
        for (int i = 0; i < graph.size(); i++) {
            if (graph.get(listMot.get(i)).size() == k) {
                compteur += 1;
            }
        }
        return compteur;
    }


}
