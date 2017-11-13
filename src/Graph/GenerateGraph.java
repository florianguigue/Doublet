package Graph;

import Entity.Mot;
import Entity.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenerateGraph {

    public GenerateGraph() {

    }

    public static Graph createGraph(List<Mot> motList) {
        Map<Mot, List<Mot>> listMot = new HashMap<>();
        for (Mot mot1: motList) {
            List<Mot> listAdjacence = new ArrayList<>();
            for (Mot mot2: motList) {
                if (OneLetterDifference(mot1, mot2)) {
                    listAdjacence.add(mot2);
                }
            }
            listMot.put(mot1, listAdjacence);
        }
        Graph graph = new Graph(listMot, motList);
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
