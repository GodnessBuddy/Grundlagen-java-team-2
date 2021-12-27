
import java.time.chrono.HijrahEra;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {
        
    public static void main(String[] args) throws Exception {

        
       
        // System objects
        Scanner in = new Scanner(System.in);



        // Objekte erzeugen
        Team team = new Team();
            team.teamname = "";
            team.teammitglieder = "";
            team.disadvantage = "";
            team.advantage = "";
 
            
        
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


                    //Fehler der noch behoben werden muss (weiter muss 2 mal eingabe Taste)
                    if (input.equals("weiter")) {
                        break;  

                    }else if (input.equals("hilfe")) {
                        e++;
                        continue;
                    

                    } else if (input.equals("karmapunkte")) {
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
            System.out.println("Team Bravo 6:");
            System.out.println("\t" + "Der Truppleiter, welcher dir direkt unterstellt wäre, heißt Vladimir Gorbatschow und gibt deine Befehle an das Team weiter.");
            System.out.println("\t" + "Die Namen der Teammitglieder lauten: Jimmy, Riger, Jessica, Eugene, Anastasia, Norman, Stephen und Bernd."); 
            System.out.println("\t" + "Dieses Team ist sehr gut in Stealth Angriffen und hat einen starken Kampfgeist."); 
            System.out.println("");
            System.out.println("Team Delta 5:");
            System.out.println("\t" + "Der Truppleiter, welcher dir direkt unterstellt wäre, heißt heißt Jenz Frust und gibt deine Befehle an das Team weiter.");
            System.out.println("\t" + "Die Namen der Teammitglieder lauten: Tina, Charlkotte, Peter, Vlad, Dimitri, Achmed, Klaus und Hanz.");
            System.out.println("\t" + "Dieses Team ist sehr taktisch und sehr fokusiert.");
            System.out.println("");

            System.out.println("--------------------------------------");
            System.out.println("Wenn du dich für das Team Bravo 6 entscheidest dann schreibe " + "1");
            System.out.println("Wenn du dich für das Team Delta 5 entscheidest dann schreibe " + "2");
            System.out.println("--------------------------------------");
            

            //Teamauswahl
            String teamauswahl = in.nextLine();

                switch(teamauswahl){

                    case "1": 
                        team.teamname = "Bravo-6";
                        break;
  
                    case "2": 
                        team.teamname = "Delta-5";
                        break;
                          
                    default: 
                        System.out.println("Falsche Eingabe");
                        
                        
                    
                     
                }





            //Story Bravo-6
            if(team.teamname.equals ("Bravo-6")) {

                team.teammitglieder = "Jimmy, Riger, Jessica, Eugene, Anastasia, Norman, Stephen und Bernd";
                team.advantage = "stealth";
                team.disadvantage = "Differenzen mit dem Truppleiter"; 

                
                System.out.println("--------------------------------------");
                System.out.println("Du hast das Team Bravo-6 gewählt.");
                System.out.println("--------------------------------------");      
                System.out.println("Zuerst lernst du das team kennen, falls dieses dich nicht interessiert, dann schreibe --weiter--");
                System.out.println("schreibe --teammitglieder um die Namen deines Teammitglieder zu sehen");
                System.out.println("schreibe --advantages-- um die Vorteile dieses Teams zu sehen");
                System.out.println("schreibe --disadvantages-- um die Nachteile dieses Teams zu sehen");
                System.out.println("--------------------------------------");




                String inputteam = in.nextLine();

                int m = 1;

                while(m < 1){
                
                    if (inputteam.equals("teammitglieder")){
                        System.out.println(team.teammitglieder);
                    }
    
                    else if (inputteam.equals("advantage")){
                        System.out.println(team.advantage);
                    }
    
                    else if (inputteam.equals("disadvantage")){
                        System.out.println(team.disadvantage);
                    }
    
                    else if (inputteam.equals("weiter")){
                        m++;  
                    }
                }
                          
                    
    
               
                
            }


            
            //Story Delta-5
            else if (team.teamname.equals ("Delta-5")){

                


                team.teammitglieder = "Tina, Charlkotte, Peter, Vlad, Dimitri, Achmed, Klaus und Hanz";
                team.advantage = "taktisch und fokussiert";
                team.disadvantage = "längere Planung und Entscheidung (Liebe oder Ziele)";


                System.out.println("--------------------------------------");
                System.out.println("Du hast das Team Delta-5 gewählt.");
                System.out.println("--------------------------------------");
                System.out.println("Zuerst lernst du das team kennen, falls dieses dich nicht interessiert, dann schreibe --weiter--");
                System.out.println("schreibe --teammitglieder um die Namen deines Teammitglieder zu sehen");
                System.out.println("schreibe --advantages-- um die Vorteile dieses Teams zu sehen");
                System.out.println("schreibe --disadvantages-- um die Nachteile dieses Teams zu sehen");
                System.out.println("--------------------------------------");
                

                String inputteam = in.nextLine(); 

                int m = 1;

                while(m < 1){
                
                    if (inputteam.equals("teammitglieder")){
                        System.out.println(team.teammitglieder);
                    }
    
                    else if (inputteam.equals("advantage")){
                        System.out.println(team.advantage);
                    }
    
                    else if (inputteam.equals("disadvantage")){
                        System.out.println(team.disadvantage);
                    }
    
                    else if (inputteam.equals("weiter")){
                        m++;  
                    }
                }
                
            }

            

            else {
                System.out.println("Du hast kein Team gewählt.");
            }
            













                
            
        //Scanner schließen warning
        in.close();
        
    }

}
