
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
            game.setHilfe("Hier steht die Hilfe.");     //setzt die Hilfe
            //game.showhilfe();   zeigt die Hilfe
            game.spieler1.karmapunkte = 0;
            game.setfalsecommand("Falsche Eingabe!");   //setzt die Falsche Eingabe 
            //game.showfalsecommand();    Zeigt an, dass die Eingabe Falsch wahr
            System.out.print(game.spieler1.name); 


        //Player


        
            
       


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
                game.showfalsecommand();
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
                System.out.println("\t" + "Wenn du Hilfe benötigst dann schreibe --hilfe--");
                System.out.println(" ");
                System.out.println("\t" + "Wenn du dir deine Karma Punkte anzeigen lassen willst dannn schreibe --karmapunkte--");
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
                        game.showfalsecommand();
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


            //Teamauswahl
            int t = 0;

            while (t < 1 ) {

                System.out.println("--------------------------------------");
                System.out.println("Wenn du dich für das Team Bravo 6 entscheidest dann schreibe " + "1");
                System.out.println("Wenn du dich für das Team Delta 5 entscheidest dann schreibe " + "2");
                System.out.println("--------------------------------------");

                String teamauswahl = in.nextLine();
        
                    if(teamauswahl.equals ("1")) { 
                        team.teamname = "Bravo-6";
                        break;
                    }
                
                    else if (teamauswahl.equals("2")) {
                        team.teamname = "Delta-5";
                        break;
                    }
                
                    else  {
                        game.showfalsecommand();
                        continue;
                    }               
            }
            





            //Story Bravo-6
            if(team.teamname.equals ("Bravo-6")) {

                team.teammitglieder = "Jimmy, Riger, Jessica, Eugene, Anastasia, Norman, Stephen und Bernd";
                team.advantage = "stealth";
                team.disadvantage = "Differenzen mit dem Truppleiter"; 



            


                System.out.println("--------------------------------------");
                System.out.println("Du hast das Team Bravo-6 gewählt.");
                System.out.println("--------------------------------------");

                
                //int m für den loop für die andvantages usw
                int m = 0;

                while(m < 1){  

                    System.out.println("Zuerst lernst du das team kennen, falls dieses dich nicht interessiert, dann schreibe --weiter--");
                    System.out.println("schreibe --teammitglieder um die Namen deines Teammitglieder zu sehen");
                    System.out.println("schreibe --advantage-- um die Vorteile dieses Teams zu sehen");
                    System.out.println("schreibe --disadvantage-- um die Nachteile dieses Teams zu sehen");
                    System.out.println("--------------------------------------");



                    //Abfrage nach Teammitglieder, advantages, disadvantages
                    String inputteam = in.nextLine();
                
                    if (inputteam.equals("teammitglieder")){
                        System.out.println(team.teammitglieder);
                        continue;
                    }
    
                    else if (inputteam.equals("advantage")){
                        System.out.println(team.advantage);
                        continue;
                    }
    
                    else if (inputteam.equals("disadvantage")){
                        System.out.println(team.disadvantage);
                        continue;
                    }
    
                    else if (inputteam.equals("weiter")){
                        m++;  
                    }
                    else {
                        game.showfalsecommand();
                        continue;
                    }
                }

                    System.out.println("--------------------------------------");  
                    System.out.println("Diskussion was man angreift"); //Diskussion mit dem Team, was man angreift 
                    System.out.println("--------------------------------------");  


                    //ao = Angriffsortabfrage für Bravo 6   
                    int ao = 0;
                    while (ao < 1) {

                    System.out.println("--------------------------------------"); 
                    System.out.println("Du kannst dich nun zwischen 2 verschiedenen Orten entscheiden, die du angreifen möchtest.");
                    System.out.println("Die erste möglichkeit währe die Satellittenbasis nähe Leipzig.");
                    System.out.println("\t" + "Schreibe 1 um diesen Angriff zu starten.");   
                    System.out.println("");  
                    System.out.println("Die zweite Möglichkeit ist das Munitionslager nähe Osnabrück");
                    System.out.println("\t"+ "Schreibe 2 um diesen Angriff zu starten.");        
                    System.out.println("--------------------------------------"); 


                        // Abfrage für den Angriffsort
                        String angriffsort = in.nextLine();

                        String Leipzig = "die Satellittenbasis in der nähe von Leipzig";
                        String Osnabrück = "das Munitionslager in der nähe von Osnabrück";

                        if (angriffsort.equals("1")) {

                            game.spieler1.karmapunkte = -10; //Karmapunkte werden auf -10 gesetzt 
                            System.out.println("--------------------------------------"); 
                            System.out.println("Du hast dich entschieden" + Leipzig + "anzugreifen.");
                            System.out.println("Deine Karmapunkte betragen" + "=" + game.spieler1.karmapunkte); 
                            System.out.println("--------------------------------------"); 
                            ao++;
     
                        }

                        else if (angriffsort.equals("2")) {

                            game.spieler1.karmapunkte = 0; // Karmapunkte werden auf 0 gesetzt.
                            System.out.println("--------------------------------------"); 
                            System.out.println("Du hast dich entschieden" + Osnabrück + "anzugreifen."); 
                            System.out.println("Deine Karmapunkte betragen" + "=" + game.spieler1.karmapunkte);
                            System.out.println("--------------------------------------"); 
                            ao++;

                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }
                    }

                System.out.println(game.spieler1.karmapunkte); //kurzer Test (kann später gelöscht werden) 



                //Entscheidung Satellitenbasis (Karmapunkte = -10)
                if (game.spieler1.karmapunkte==-10) {

                    System.out.println("--------------------------------------"); 
                    System.out.println("Hier ist die Story für die Satellitenbasis"); //Text der Story für Satellitenbasis 
                    System.out.println("--------------------------------------"); 

                }
                
                
                //Entscheidung für Munitionslager (Karmapunkte = 0)
                if (game.spieler1.karmapunkte==0) {


                    System.out.println("--------------------------------------"); 
                    System.out.println("Hier steht die Story fürs Munitionslager"); //Story Munitionslager
                    System.out.println("--------------------------------------"); 



                    System.out.println("--------------------------------------"); 
                    System.out.println("Dein Team ist Sauer auf dich, da ein Mann verloren gegangen ist");
                    System.out.println("Du kannst dich nun entscheiden, wie du handeln möchtest");
                    System.out.println("Sei dir bewusst, dass jede Entscheidung einen andere auswirkung hat");
                    System.out.println("--------------------------------------"); 


                    int se  = 0; // se = Schuldentscheidung
                    while (se < 1) {
                     
                        System.out.println("--------------------------------------"); 
                        System.out.println("\t" + "Schreibe --1-- um zu sagen, dass es deine Schuld war"  );
                        System.out.println("\t" + "Schreibe --2-- um die Schuld auf den Truppenleiter zu schieben");   
                        System.out.println("");
                        System.out.println("Wenn du --karmapunkte-- schreibst, siehst du deine Karmapunkte");  
                        System.out.println("Wenn du --hilfe-- schreibst, siehst du die hilfe ");
                        System.out.println("--------------------------------------"); 

                    
                        String schuldentscheidung = in.nextLine(); //Scanner für Schuldentscheidung

                        if (schuldentscheidung.equals("1")) {

                            System.out.println("--------------------------------------"); 
                            System.out.println("Du hast dich entschieden, dass du die Schuld trägst"); 
                            System.out.println("--------------------------------------"); 
                            game.spieler1.karmapunkte = -20; //Karmapunkte auf -20
                            se++;
                        }

                        else if (schuldentscheidung.equals("2")) {

                            System.out.println("--------------------------------------"); 
                            System.out.println("Du schiebst die Schuld auf den Truppleiter"); 
                            System.out.println("--------------------------------------"); 
                            game.spieler1.karmapunkte = -10; //Karmapunkte auf -10
                            se++;
                        }

                        else if (schuldentscheidung.equals("karmapunkte")) {

                            game.spieler1.showkarmapunkte(); //zeigt Karmapunkte
                            continue;
                        }

                        else if (schuldentscheidung.equals("hilfe")) {

                            game.showhilfe(); //zeigt Hilfe
                            continue;
                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }
                    }

                    

                }   

                System.out.println("Hat geklappt" + game.spieler1.karmapunkte); // Einfacher Test (sollte gelöscht werden)


                //Abfrage der Karmapunkte, für den Verlauf des Spieles.
                if (game.spieler1.karmapunkte == 0) {


                }

                else if (game.spieler1.karmapunkte == -10) {
                
                
                }

                else if (game.spieler1.karmapunkte == -20 ) {


                }
                          
                    
    
               
                
            } //Story Ende Bravo-6 



            //Story Delta-5 falls dafür Entschieden 
            else if (team.teamname.equals ("Delta-5")){

                team.teammitglieder = "Tina, Charlkotte, Peter, Vlad, Dimitri, Achmed, Klaus und Hanz";
                team.advantage = "taktisch und fokussiert";
                team.disadvantage = "längere Planung und Entscheidung (Liebe oder Ziele)";


                
                

                

                    

                    System.out.println("--------------------------------------");
                    System.out.println("Du hast das Team Delta-5 gewählt.");
                    System.out.println("--------------------------------------");


                //int m für den loop für die andvantages usw
                int m = 0;

                while(m < 1){

                    System.out.println("--------------------------------------");
                    System.out.println("Zuerst lernst du das team kennen, falls dieses dich nicht interessiert, dann schreibe --weiter--");
                    System.out.println("schreibe --teammitglieder um die Namen deines Teammitglieder zu sehen");
                    System.out.println("schreibe --advantage-- um die Vorteile dieses Teams zu sehen");
                    System.out.println("schreibe --disadvantage-- um die Nachteile dieses Teams zu sehen");
                    System.out.println("--------------------------------------");
                
                    //Abfrage nach advantages, disadvantages, Teammitglieder
                    String inputteam = in.nextLine(); 
                
                    if (inputteam.equals("teammitglieder")){
                        System.out.println(team.teammitglieder);
                        continue;
                    }
    
                    else if (inputteam.equals("advantage")){
                        System.out.println(team.advantage);
                        continue;
                    }
    
                    else if (inputteam.equals("disadvantage")){
                        System.out.println(team.disadvantage);
                        continue;
                    }
    
                    else if (inputteam.equals("weiter")){
                        m++;  
                    }
                    else {
                        game.showfalsecommand();
                        continue;
                    }

                }
                
                
                System.out.println("--------------------------------------");  
                System.out.println("Diskussion was man angreift"); //Diskussion mit dem Team, was man angreift 
                System.out.println("--------------------------------------");  


                //ao = Angriffsortabfrage  für  Delta 5   
                int ao = 0;
                while (ao < 1) {

                    System.out.println("--------------------------------------"); 
                    System.out.println("Du kannst dich nun zwischen 2 verschiedenen Orten entscheiden, die du angreifen möchtest.");
                    System.out.println("Die erste möglichkeit währe die Satellittenbasis nähe Leipzig.");
                    System.out.println("\t" + "Schreibe 1 um diesen Angriff zu starten.");   
                    System.out.println("");  
                    System.out.println("Die zweite Möglichkeit ist das Munitionslager nähe Osnabrück");
                    System.out.println("\t"+ "Schreibe 2 um diesen Angriff zu starten.");        
                    System.out.println("--------------------------------------"); 


                    // Abfrage für den Angriffsort von Delta 5
                    String angriffsort = in.nextLine();

                    String Leipzig = "die Satellittenbasis in der nähe von Leipzig";
                    String Osnabrück = "das Munitionslager in der nähe von Osnabrück";



                    //Falls eingabe 1: (Leipzig) 
                    if (angriffsort.equals("1")) {

                        game.spieler1.karmapunkte = -10; //Karmapunkte werden auf -10 gesetzt 
                        System.out.println("--------------------------------------"); 
                        System.out.println("Du hast dich entschieden" + Leipzig + "anzugreifen.");
                        System.out.println("Deine Karmapunkte betragen" + "=" + game.spieler1.karmapunkte); 
                        System.out.println("--------------------------------------"); 
                        ao++;
 
                    }
                    //Falls eingabe 2: (Osnabrück)
                    else if (angriffsort.equals("2")) {

                        game.spieler1.karmapunkte = 10; // Karmapunkte werden auf 10 gesetzt.
                        System.out.println("--------------------------------------"); 
                        System.out.println("Du hast dich entschieden" + Osnabrück + "anzugreifen."); 
                        System.out.println("Deine Karmapunkte betragen" + "=" + game.spieler1.karmapunkte);
                        System.out.println("--------------------------------------"); 
                        ao++;

                    }

                    else {

                        game.showfalsecommand();
                        continue;
                    }
                }//Story ende Osnabrück

                //Wenn Leipzig gewählt wurde
                if (game.spieler1.karmapunkte == -10) {

                    System.out.println("--------------------------------------"); 
                    System.out.println("Das Team ist sauer auf dich.");
                    System.out.println("Du kannst dich nun entscheiden wie du handelst.");  
                    System.out.println(""); 
                    System.out.println("--------------------------------------"); 
                    System.out.println("\t" +"Schreibe --1-- um dich rauszureden"); //bessere Formulierung 
                    System.out.println("\t"+ "Schreibe --2-- um deaskalierend zu wirken. "); 
                    System.out.println("");
                    System.out.println("Wenn du --karmapunkte-- schreibst, siehst du deine Karmapunkte");  
                    System.out.println("Wenn du --hilfe-- schreibst, siehst du die hilfe ");
                    System.out.println("--------------------------------------"); 


                    int he = 0; //int für entscheidung wie du handelst

                    while (he < 1){
                        
                        String handelsentscheidung = in.nextLine();

                        // wenn 1 ,dann karmapunkte = -20
                        if (handelsentscheidung.equals("1")) {

                            game.spieler1.karmapunkte = -20;
                            System.out.println("--------------------------------------"); 
                            System.out.println("du redest dich heraus. Team wird sauer"); 
                            System.out.println("--------------------------------------"); 
                            break;

                        }
                        // wenn 2, dann Karmapunkte auf 0 wieder
                        else if (handelsentscheidung.equals("2")) { 

                            game.spieler1.karmapunkte = 0;
                            System.out.println("--------------------------------------"); 
                            System.out.println("du wirkst deeskalierend"); 
                            System.out.println("--------------------------------------"); 
                            break;
                        }

                        else if (handelsentscheidung.equals("karmapunkte")) {

                            game.spieler1.showkarmapunkte();
                            continue;
                        }
                        
                        else if (handelsentscheidung.equals("hilfe")) {

                            game.showhilfe();
                            continue;
                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }

                            

                    }

                    //Falls die Karmapunkte auf -20 sind bei Delta 5 (Wenn du dich herrausredest)
                    if (game.spieler1.karmapunkte == -20) {

                        System.out.println("--------------------------------------"); 
                        System.out.println("Achmet geht mit einem Messer auf dich los.");
                        System.out.println(""); 


                        int aa = 0; // int aa = achmetangriff
                        while (aa < 1) {

                            System.out.println("Du kannst dich zwischen entscheiden wie du gegen ihn handelst.");
                            System.out.println(""); 
                            System.out.println("\t"+ "Wenn du --1-- schreibst, dann verteidigst du dich"); 
                            System.out.println("\t"+ "Wenn du --2-- schreibst, dann machst du nichts");
                            System.out.println("\t" + "Wenn du --3-- schreibst, dann bringst du Achmet um.");  
                            System.out.println("--------------------------------------"); 

                            String achmetentscheidung = in.nextLine();

                            //Wenn du dich verteidigst
                            if (achmetentscheidung.equals("1")) {

                                System.out.println("Du verteidigst dich");
                                game.spieler1.karmapunkte = -10;
                                break;
                            }

                            //Wenn du nichts tust
                            else if (achmetentscheidung.equals("2")) {

                                System.out.print("Du bist Gestorben");
                                System.exit(0);
                            }

                            //Wenn du Ihn umnbringst
                            else if (achmetentscheidung.equals("3")) {

                                System.out.println("Du hast Achmet umgebracht");
                                game.spieler1.karmapunkte = -40; 
                                break;
                            }

                            else {

                                game.showfalsecommand();
                                continue;
                            }

                        }

                    }

                }//Story für Leipzig ende


                /*Karmapunkte abfrage




                */
                int kpa = 0; // int Karmapunkte abfrage 

                while (kpa < 1) {

                    //Karmapunkte sind bei -40 
                    if (game.spieler1.karmapunkte == -40) {

                        System.out.println("--------------------------------------"); 
                        System.out.println("Dein Team spricht mit dir über deine Entscheidungen");
                        System.out.println("--------------------------------------"); 
                        

                        while (game.spieler1.karmapunkte == -40) {

                            

                            System.out.println("Du kannst dich entscheiden ob du ihnen über deine Vergangenheit erzählst, dass dir die Mission sehr wichtig ist.");
                            System.out.println("Oder du schweigst, um die Mission nicht  zu gefährden.");
                            System.out.println("Schreibe --1-- um über deine Vergangenheit zu erzählen."); 
                            System.out.println("Schreibe --2-- um zu schweigen."); 
                            System.out.println("--------------------------------------"); 

                            String inputkarma = in.nextLine(); //Inputkarma nur für das nächste If- Statement

                                if (inputkarma.equals("1")) {

                                    System.out.println("--------------------------------------"); 
                                    System.out.println("Erzählt die Geschichte"); 
                                    System.out.println("--------------------------------------"); 
                                    game.spieler1.karmapunkte = -30;
                                }

                                else if (inputkarma.equals("2")) { 
 
                                    System.out.println("--------------------------------------"); 
                                    System.out.println("Du schweigst."); 
                                    System.out.println("--------------------------------------"); 
                                    game.spieler1.karmapunkte = -50;
                                }

                                else {

                                    game.showfalsecommand();
                                    continue;
                                }

                        }  
                    }

                    //Karmapunkte sind bei -10
                    else if (game.spieler1.karmapunkte == -10) {

                        System.out.println("--------------------------------------"); 
                        System.out.println("Gespräch mit Team über deine Entscheidungen, bitten weniger Risiko einzugehen"); 
                        System.out.println("--------------------------------------"); 

                        //While looop
                        //Wenn Karmapunkte nicht mehr -10 hört er auf
                        while (game.spieler1.karmapunkte == -10) {


                            System.out.println("--------------------------------------"); 
                            System.out.println("Dein Team bittet dich weniger Risiko einzugehen."); 
                            System.out.println("--------------------------------------"); 
                            System.out.println("--------------------------------------"); 
                            System.out.println("Schreibe --1-- um weniger Risiko einzugehen."); 
                            System.out.println("Schreibe --2-- um nicht darauf zu reagieren."); 
                            System.out.println("--------------------------------------"); 

                            String inputkarma = in.nextLine(); //Inputkarma nur für das nächste If- Statement

                                if (inputkarma.equals("1")){

                                    System.out.println("--------------------------------------"); 
                                    System.out.println("Du gehsts weniger Risiko ein"); 
                                    System.out.println("--------------------------------------"); 
                                    game.spieler1.karmapunkte = 0;
                                }
                                else if (inputkarma.equals("2")) {

                                    System.out.println("--------------------------------------"); 
                                    System.out.println("Du reagierst darauf nicht"); 
                                    System.out.println("--------------------------------------"); 
                                    game.spieler1.karmapunkte = -20;
                                }
                                else {

                                    game.showfalsecommand();
                                    continue;
                                }
                        }
                        
                    }

                    //Karmapunkte sind bei +10
                    else if (game.spieler1.karmapunkte == 10) {

                        System.out.println("--------------------------------------"); 
                        System.out.println("Team vertraut dir mehr"); 
                        System.out.println("--------------------------------------"); 
                        System.out.println("Du redest mit dem Truppleiter und er fragt dich wieso du das alles tust."); 
                        System.out.println("Du kannst dich entscheiden, ob du über die Vorgeschichte redest oder nicht.");
                        System.out.println(""); 

                        //while loop 
                        int tr = 0; 

                        while (tr < 1) {

                            System.out.println("Schreib --1-- um seriös zu bleiben und ihm nicht die Wahrheit zu erzählen");
                            System.out.println("Schreibe --2-- um über deine Vorgeschichte zu berichten.");  
                            System.out.println("--------------------------------------"); 

                            // Scanner
                            String inputkarma = in.nextLine(); //Inputkarma nur für das nächste If- Statement

                            if(inputkarma.equals("1")) {

                                System.out.println("--------------------------------------"); 
                                System.out.println("Du bleibst seriös"); 
                                System.out.println("--------------------------------------"); 
                                break;
                            }
                            else if(inputkarma.equals("2")){

                                System.out.println("--------------------------------------"); 
                                System.out.println("Du erzählst dem Truppleiter deine Vorgeschichte"); 
                                System.out.println("--------------------------------------"); 
                                break;
                            }
                            else {

                                game.showfalsecommand();
                                continue;
                            }
                            

                        }
                        

                        System.out.println("--------------------------------------"); 
                        System.out.println("Planung nächste Mission"); 
                        System.out.println("--------------------------------------"); 
                        break;

                        
                    }


                    //Bei dieser Karmapunktenabfrage kommt es direkt zur Planung
                    //Karmapunkte sind bei 0
                    else if (game.spieler1.karmapunkte == 0) {

                        System.out.println("--------------------------------------"); 
                        System.out.println("Planung nächste Mission"); 
                        System.out.println("--------------------------------------"); 
                        break;
                    }


                    /*Karmapunkte sind bei -50 dann kommt es zur Planung der Mission
                    Das hier passierte nachdem man sich entschied die Vorgeschichte nicht zu erwähnen (Line  667-704)
                    */

                    else if (game.spieler1.karmapunkte == -50) {

                        System.out.println("--------------------------------------"); 
                        System.out.println("Planung nächste Mission"); 
                        System.out.println("--------------------------------------");  
                        break;  
                    }

                    /*Karmapunkte sind bei -30 dann kommt es zur Planung der Mission
                    Das hier passierte nachdem man sich entschied die Vorgeschichte zu erwähnen (Line  667-704)
                    */
                    else if (game.spieler1.karmapunkte == -30) {

                        System.out.println("--------------------------------------"); 
                        System.out.println("Planung nächste Mission"); 
                        System.out.println("--------------------------------------"); 
                        break;
                    }

                    /* Karmapunkte bei -20. Passiert da, wo man nicht auf den Vorschlag wegen des Risikos eingeht. 
                    Line (708- 744) 
                    */
                    else if(game.spieler1.karmapunkte == -20) {

                        System.out.println("--------------------------------------"); 
                        System.out.println("Planung nächste Mission"); 
                        System.out.println("--------------------------------------"); 
                        break;  
                    }

                } //Karmapunkte Abfrage ende 

                //Ab Hier fängt die Planung der nächsten Mission statt.
                

            } //story Ende Delta 5

        
            



    

            else {
                System.out.println("Du hast kein Team gewählt."); 
            }
            













                
            
        //Scanner schließen warning
        in.close();
        
    } //schluss der Main Methode

} 
