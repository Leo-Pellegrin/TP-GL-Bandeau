package exemple;

import bandeau.Bandeau;

public class Effet2 implements Effet{
    private String nom;

    public Effet2(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }
 
    public void start(Bandeau b){
        b.setMessage("");
        String msg = "Je m affiche petit a petit";
        String tmp = "";
        for(int i = 0; i < msg.length(); i++){
            tmp += " ";
        }
        StringBuilder sBuilder = new StringBuilder(tmp);
        System.out.println(tmp);
        for(int i = 0; i < msg.length(); i++){
            sBuilder.setCharAt(i, msg.charAt(i));
            System.out.println(sBuilder.toString());
            b.setMessage(sBuilder.toString());
            b.sleep(200);
        }
    }
}
