package Import;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Import {

    private ArrayList<String> Liste;
}
    public boolean import(){
        String token1 = "";
        Scanner inFile1 = new Scanner(new File("KeyWestTemp.")).useDelimiter(",\\s*");

        // Original answer used LinkedList, but probably preferable to use ArrayList in most cases
        // List<String> temps = new LinkedList<String>();
        List<String> temps = new ArrayList<String>();

        // while loop
        while (inFile1.hasNext()) {
            // find next line
            token1 = inFile1.next();
            temps.add(token1);
        }
        inFile1.close();

        String[] tempsArray = temps.toArray(new String[0]);

        for (String s : tempsArray) {
            System.out.println(s);
        }

    }
