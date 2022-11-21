package exemple;

import java.util.ArrayList;
import java.util.Random;

import bandeau.Bandeau;

public class Effet1 implements Effet{
    private String nom;

    public Effet1(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public void start(Bandeau b){
        String msg = "L effet affiche les lettres aléatoirement";
        String tmp = "";
        for(int i = 0; i < msg.length(); i++){
            tmp += "_";
        }
        b.setMessage(tmp);

        StringBuilder sBuilder = new StringBuilder(tmp);
        ArrayList<Integer> lPos = new ArrayList<Integer>();
        while(lPos.size() < msg.length()){
            double pos = Math.random() * ( (msg.length()) - 0 );
            if(lPos.contains((int)pos)) continue;

            sBuilder.setCharAt((int) pos, msg.charAt((int)pos));
            lPos.add((int)pos);
            b.setMessage(sBuilder.toString() );
            b.sleep(200);
        }
    }
}
