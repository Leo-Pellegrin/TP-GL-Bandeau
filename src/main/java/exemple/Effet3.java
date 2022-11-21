package exemple;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import bandeau.Bandeau;

public class Effet3 implements Effet{
    private String nom;

    public Effet3(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public void start(Bandeau b){
        b.setMessage("JE TOURNEEEEE");
        b.sleep(1500);
        for(double i = Math.PI / 10.0f; i < Math.PI * 2 + Math.PI /10.0f; i+= Math.PI/10.0f){
            b.setRotation(i);
            b.sleep(100);
        }
        b.sleep(3000);
        b.setMessage("JE ZOOMEEEE");
        b.setBackground(Color.CYAN);
        for(int i = 0; i < 80; i++){
            b.setFont(new Font("SERIF", Font.ITALIC, 10 + i));
            b.sleep(100);
        }
        b.setBackground(Color.YELLOW);
        b.setMessage("JE DEZOOMEEEEE");
        for(int i = 80; i > 10; i--){
            b.setFont(new Font("SERIF", Font.ITALIC, i));
            b.sleep(100);
        }
    }
}
