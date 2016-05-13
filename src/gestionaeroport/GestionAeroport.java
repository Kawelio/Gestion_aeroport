package gestionaeroport;

import java.util.Scanner;

/**
 *
 * @author Lucas_VN
 */
public class GestionAeroport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monde world = new Monde();
        int reponse=0;
        do{
            System.out.println("---- MENU ---------------------------\n");
            System.out.println("| 1 -> Ajouter un aeroport          |\n");
            System.out.println("| 2 -> Afficher l'état du monde     |\n");
            System.out.println("| 3 -> Ajouter un aeronef           |\n");
            System.out.println("| 4 -> Faire un plein de carburant  |\n");
            System.out.println("| 5 -> Afficher l'état d'un aeronef |\n");
            System.out.println("| 6 -> Quitter                      |\n");
            System.out.println("-------------------------------------\n");
            reponse = new Scanner(System.in).nextInt();
            switch (reponse) {
                case 1:
                    world.ajouterAeroport();
                    break;
                case 2:
                    world.afficherEtatMonde();
                    break;
                case 3:
                    world.addAeronef();
                    break;
                case 4:
                    //world.fairePleinCarburant();
                    break;
                case 5:
                    //world.afficherEtatAeronef();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while(reponse!=5);
    }
    
}
