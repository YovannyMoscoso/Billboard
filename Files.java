
package domain;

import java.io.*;

public class Files{

    

    public static void anexFile(String nameFile, String content) {
        File archivo = new File(nameFile);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(archivo, true));
            output.println(content);
            output.close();
            //System.out.println("It has been written in the File");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }
    
}
