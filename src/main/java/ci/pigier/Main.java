package ci.pigier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int totalMots = 0 ;

        try {
            File fichier = new File("texte.txt") ;
            Scanner scanner = new Scanner(fichier) ;

            while(scanner.hasNextLine()){
                String ligne = scanner.nextLine() ;

                // Sépare les chaînes avec des espaces
                String[] mots = ligne.trim().split("\\s+") ;

                // Évite de compter des lignes vides
                if (!ligne.trim().isEmpty()){
                    totalMots += mots.length ;
                }
            }

            scanner.close();

            System.out.println(" Nombre total de mots : " + totalMots);

        }catch (FileNotFoundException e){
            System.err.println("Fichier introuvable : " + e.getMessage());
        }


    }
}
