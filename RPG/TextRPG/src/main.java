
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {

    public static void main(String[] args) throws Exception {

        
        
        // System objects
        Scanner in = new Scanner(System.in);

        // Objekte erzeugen
        Main testMain = new Main();


        //Game 
        Game game = new Game(new Player("", 100));
            game.setHilfe("Hilfe");
            game.showhilfe();
            System.out.print(game.spieler1.name);
            	


        //int a für Anfang des Spiels 
        int a = 0;

            //Hier wird gefragt ob das Spiel gespielt werden will :
           while (a <= 1) {
                a++;

            System.out.println("Willkommen zu THE REVENGE");

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
                System.exit(0);  
                
            } else
                System.out.println("Falsche Eingabe");
                System.exit(0);
            }
            

            
            //player Name der in der nächsten Zeile gelesen wird 
            System.out.println("--------------------------------------");
            System.out.println("Wie willst du heißen:");
    
                game.spieler1.name = in.nextLine();
                
            
            
            //Variable e für Einführung
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


    
        //Input
        String input = in.nextLine();

        //Abfrage für Hilfe/Karmapunkte 
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
            System.out.println("Hier Steht die Einleitung");
            System.out.println("--------------------------------------");

            System.out.println("Du kannst dich nun zwischen 2 Teams entscheiden");
            System.out.println("");
            System.out.println("Team Bravo 6");
            System.out.println("\t" + "Beschreibung");
            System.out.println("");
            System.out.println("Team Delta 5");
            System.out.println("\t" + "Beschreibung");
            System.out.println("");

            System.out.println("--------------------------------------");
            System.out.println("Wenn du dich für das Team Bravo 6 entscheidest dann schreibe " + "1");
            System.out.println("Wenn du dich für das Team Delta 5 entscheidest dann schreibe " + "2");
            System.out.println("--------------------------------------");

            
            String teamauswahl = in.nextLine();

                switch(teamauswahl){

                    case "1": System.out.println("Du hast dich für das Team Bravo 6 entschieden"); 
                        testMain.bravo6();
                        break;
                        

                    case "2": System.out.println("Du hast dich für das Team Delta 5 entschieden");
                        testMain.delta5();
                        break;
                
                    default: System.out.println("Falsche Eingabe");
                    
                }

           
            
        //Scanner schließen warning
        in.close();
        
    }



    //Methode vom Team Bravo 6
    public void bravo6() {
        System.out.println("Es geht mit der Story von Bravo 6 weiter");
    }
    //Methode des Teams Delta 5
    public void delta5() {
        System.out.println("Es geht mit der Story von Delta 5 weiter");
    }
}
