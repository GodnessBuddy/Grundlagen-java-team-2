
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {

        // System objects
        Scanner in = new Scanner(System.in);


        Player player = new Player();
        player.karmapunkte = 0;
    

        
        boolean start = true;

        START:
        while(start){
            System.out.println("--------------------------------------");
            System.out.println("Möchtest du das Spiel spielen?");
            System.out.println("\t" + "Schreibe 1 um das Spiel zu beginnen");
            System.out.println("\t" + "Schreibe 2 um das Spiel nicht zu beginnen");
            System.out.println("--------------------------------------");

            String input = in.nextLine();

            if(input.equals("1")){
              break;
            }
            else if(input.equals("2")){
                continue START; 
            }
            else 
                System.out.println("Falsche Eingabe");

        }


        System.out.println("--------------------------------------");
        System.out.println("Wie willst du heißen:");
    
        player.name = in.nextLine();  // variable name



        System.out.println("--------------------------------------");
        System.out.println("Dein Name ist:");
        System.out.println(player.name); // Scanner prints the input 
        System.out.println("--------------------------------------");

       


            

        
            
        
    }

}
