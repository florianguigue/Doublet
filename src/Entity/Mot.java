package Entity;

import java.util.List;

public class Mot {

    private String texte;
    private List<Mot> voisins;

    public Mot(String texte) {
        this.voisins = null;
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public List<Mot> getVoisins() {
        return voisins;
    }

    public void setVoisins(List<Mot> voisins) {
        this.voisins = voisins;
    }
}
