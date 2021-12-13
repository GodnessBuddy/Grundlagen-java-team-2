
import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;
public class Main {
    public static void main(String[] args) throws Exception {




        // Scanner 
        Scanner in = new Scanner(System.in);


        
        System.out.println("--------------------------------------");
        System.out.println("Wie willst du heißen:");


        // Scanner reads the input and prints it 
        String input = in.nextLine();
        System.out.println("--------------------------------------");



        System.out.println("Dein Name ist:");
        System.out.println(input);
    
    }
}
