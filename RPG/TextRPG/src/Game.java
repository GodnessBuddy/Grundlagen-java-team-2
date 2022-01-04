
public class Game {
    
    //Attribute
    private String hilfe;
    public String weiter;
    public Player spieler1;
    private String falscheeingabe;


    //Methoden
    public void showhilfe() {
        System.out.println(hilfe);
    }

    public void setHilfe(String pHilfe){
        this.hilfe = pHilfe;
    }

    public void showfalsecommand() {
        System.out.println(falscheeingabe);
    }

    public void setfalsecommand(String pFalscheeingabe){
        this.falscheeingabe = pFalscheeingabe;
    }

    
    //Konstruktor
    public Game(Player pPlayer){
        spieler1 = pPlayer;
        
     }
        

    

    
    

}
