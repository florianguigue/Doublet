import Entity.Mot;
import Utilitaire.Import;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        File file = new File("fichierTexte/mots04lettres.txt");
        List<Mot> mots = null;
        try {
            mots = Import.importer(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
