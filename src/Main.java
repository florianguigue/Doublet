import Entity.Mot;
import Entity.Graph;
import Graph.GenerateGraph;
import Utilitaire.Import;
import java.io.File;
import java.util.List;

public class Main {
    private final static String FILE_4 = "fichierTexte/mots04lettres.txt";
    private final static String FILE_5 = "fichierTexte/mots05lettres.txt";
    private final static String FILE_6 = "fichierTexte/mots06lettres.txt";
    private final static String FILE_7 = "fichierTexte/mots07lettres.txt";
    private final static String FILE_8 = "fichierTexte/mots08lettres.txt";
    private final static String FILE_9 = "fichierTexte/mots09lettres.txt";
    private final static String FILE_10 = "fichierTexte/mots10lettres.txt";
    private final static String FILE_11 = "fichierTexte/mots11lettres.txt";
    private final static String FILE_12 = "fichierTexte/mots12lettres.txt";
    private final static String FILE_13 = "fichierTexte/mots13lettres.txt";
    private final static String FILE_14 = "fichierTexte/mots14lettres.txt";
    private final static String FILE_15 = "fichierTexte/mots15lettres.txt";
    private final static String FILE_16 = "fichierTexte/mots16lettres.txt";
    private final static String FILE_17 = "fichierTexte/mots17lettres.txt";
    private final static String FILE_18 = "fichierTexte/mots18lettres.txt";

    public static void main(String[] args)  {
        File file = new File(FILE_12);
        List<Mot> mots = null;
        try {
            mots = Import.importer(file);
            Graph graph = GenerateGraph.createGraph(mots);

            graph.calcul();
            System.out.println(graph.getNbSommets());
            System.out.println(graph.getNbAretes());
            System.out.println(graph.getNbmotsSansVoisins());
            System.out.println(graph.sommetWithKSommets(9));
            System.out.println("Fin traitement");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
