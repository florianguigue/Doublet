package Entity;

import java.io.Serializable;
import java.util.List;

public class Mot implements Serializable{

    private String texte;

    public Mot(String texte) {
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
}
