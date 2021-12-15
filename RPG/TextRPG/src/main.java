
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        // System objects
        Scanner in = new Scanner(System.in);

        Player player = new Player();
        player.karmapunkte = 0;

        Game game = new Game();
        game.karmapunkt = "Deine Karmapunkte sind :";
        game.weiter = "--------------------------------------";

        
        
        //int 
        int z = 0; 
         
        while(z <2) {
            z++;


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
            while (n < 2) {
                n++;

                System.out.println("--------------------------------------");
                System.out.println("Wie willst du heißen:");
                

                //player Name der in der nächsten Zeile gelesen wird 
                player.name = in.nextLine();
            }
            

            int e = 0;

            //Einführung
            while(e <2) {
                e++;

                System.out.println("--------------------------------------");
                System.out.println("Dein Name ist:" + " " + player.name);
                System.out.println(" ");
                System.out.println("\t" + "Wenn du Hilfe benötigst dann schreibe hilfe");
                System.out.println(" ");
                System.out.println("\t" + "Wenn du dir deine Karma Punkte anzeigen lassen willst dannn schreibe karmapunkte");
                System.out.println(" ");
                System.out.println("\t" + "Wenn du die Geschichte anfangen willst dann schreibe weiter");
                System.out.println(" ");
                System.out.println("Wenn du das Spiel beginnst, dann kannst du die Hilfe nicht mehr Einsehen!");
                System.out.println("--------------------------------------");


            }  

               

                    String input = in.nextLine();

                    if (input.equals("weiter")) {
                        break;
                    } 
                    else if (input.equals("hilfe")) {
                        System.out.println("Hier steht die Hilfe");
                        continue;
                    } 
                    else if (input.equals("karmapunkte")) {
                        System.out.println(game.karmapunkt);
                        continue;
                    } 
                    else {
                        System.out.println("Falsche Eingabe");
                        continue;
                    }
                }
        

        //GAME:
        while(z < 1){ 

            System.out.println("--------------------------------------");
            System.out.println("Einleitung");
            System.out.println("//Hier Steht die Einleitung");
            System.out.println("--------------------------------------");

        




        





















        //Scanner schließen warning
        in.close();
        }
    }
}
