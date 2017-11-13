package Graph;

import Entity.Mot;

import java.util.List;

public class GenerateGraph {

    public GenerateGraph() {

    }

    public static List<Mot> createGraph(List<Mot> motList) {
        List<Mot> graph = motList;
        for (int i = 0; i < motList.size(); i++) {
            for (int j = 0; j < motList.size(); j++) {
                if (OneLetterDifference(motList.get(i), motList.get(j))) {
                    graph.get(i).getVoisins().add(motList.get(j));
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

        if(letter == 1) {
            return true;
        } else {
            return false;
        }
    }
}
