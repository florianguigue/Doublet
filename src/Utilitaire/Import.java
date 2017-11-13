package Utilitaire;

import Entity.Mot;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Import {
    public static List<Mot> importer(File importFile) throws Exception
    {
        List<Mot> mots = new ArrayList<Mot>();
        String token1 = "";
        try {
            Scanner file = new Scanner(importFile);
            while (file.hasNext()) {
                token1 = file.next();
                mots.add(new Mot(token1));
            }
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            return mots;
        }
    }
}
