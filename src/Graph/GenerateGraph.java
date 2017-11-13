package Graph;

import Entity.Mot;
import Entity.Graph;

import java.util.ArrayList;
import java.util.List;

public class GenerateGraph {

    public GenerateGraph() {

    }

    public static List<Mot> createGraph(List<Mot> motList) {
        List<Mot> graph = motList;
        for (Mot mot1: motList) {
            for (Mot mot2: motList) {
                if (OneLetterDifference(mot1, mot2)) {
                    if(mot1.getVoisins() == null) {
                        mot1.setVoisins(new ArrayList<Mot>());
                    }
                    mot1.getVoisins().add(mot2);
                }
            }
        }

        return graph;
    }

    public static boolean OneLetterDifference(Mot mot1, Mot mot2) {
        int letter = 0;
        for(int i = 0; i < mot1.getTexte().length(); i++) {
            if(mot1.getTexte().charAt(i) == mot2.getTexte().charAt(i)) {
                letter++;
            }
        }

        if(letter == mot1.getTexte().length() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
