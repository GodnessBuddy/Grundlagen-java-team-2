
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {

    public static void main(String[] args) throws Exception {

        // System objects
        Scanner in = new Scanner(System.in);






        //Game
        Game game = new Game(new Player("", 100));
            game.setHilfe("Hier steht die Hilfe");
            game.showhilfe();
            System.out.print(game.spieler1.name);
        
       

            




    

        //int a für Anfang des Spiels 
        int a = 0;

            //Hier wird gefragt ob das Spiel gespielt werden will 
            SPIELSTART:
            while (a < 2) {
                a++;

            System.out.println("Willkommen zu ");

            System.out.println("--------------------------------------");
            System.out.println("Möchtest du das Spiel spielen?");
            System.out.println("\t" + "Schreibe 1 um das Spiel zu beginnen");
            System.out.println("\t" + "Schreibe 2 um das Spiel nicht zu beginnen");
            System.out.println("--------------------------------------");

            // String input der als Scanner die nächste Zahl ließt
            String input = in.nextLine();

            if (input.equals("1")) {
                break;
            } else if (input.equals("2")) {
                continue SPIELSTART;
            } else
                System.out.println("Falsche Eingabe");
                continue SPIELSTART;

            }

        //int n für Namensvergebung
        int n = 0;

            //Namensvergebung
            while (n <= 1) {
                n++;

                System.out.println("--------------------------------------");
                System.out.println("Wie willst du heißen:");
                

                //player Name der in der nächsten Zeile gelesen wird 
                game.spieler1.name = in.nextLine();
                break;
            }
            

            int e = 0;

            //Einführung
            while(e <1000) {
                

                System.out.println("--------------------------------------");
                System.out.println("Dein Name ist:" + " " +  game.spieler1.name);
                System.out.println(" ");
                System.out.println("\t" + "Wenn du Hilfe benötigst dann schreibe hilfe");
                System.out.println(" ");
                System.out.println("\t" + "Wenn du dir deine Karma Punkte anzeigen lassen willst dannn schreibe karmapunkte");
                System.out.println(" ");
                System.out.println("\t" + "Wenn du die Geschichte anfangen willst dann schreibe weiter");
                System.out.println("--------------------------------------");


             

               

                    String input = in.nextLine();

                    if (input.equals("weiter")) {
                        break;
                    } 
                    else if (input.equals("hilfe")) {
                        System.out.println("Hier steht die Hilfe");
                        e++;
                        continue;
                    } 
                    else if (input.equals("karmapunkte")) {
                        game.spieler1.showkarmapunkte();
                        e++;
                        continue;
                    } 
                    else {
                        System.out.println("Falsche Eingabe");
                        e++;
                        continue;
                    }
            }


    
        String input = in.nextLine();



        if(input.equals("karmapunkte")) {
            game.spieler1.showkarmapunkte();
        }
        else if(input.equals("hilfe")){
            game.showhilfe();
        }






    //Story Start


        //Einleitung in das Spiel
            System.out.println("--------------------------------------");
            System.out.println("Einleitung");
            System.out.println("//Hier Steht die Einleitung");
            System.out.println("--------------------------------------");





            System.out.println("Du kannst dich nun zwischen 2 Teams entscheiden");
            System.out.println("");
            System.out.println("");
            System.out.println("Team Bravo 6");
            System.out.println("\t" + " ");





            

        




        





















        //Scanner schließen warning
        in.close();
        
    }
}
