package exemple;

import java.util.*;

import bandeau.Bandeau;

public class Scenario {
    private HashMap<Effet, Integer> lEffets;

    public Scenario(){
        this.lEffets = new HashMap<Effet, Integer>();
    }

    public void addEffet(Effet e, int nb){
        lEffets.put(e, nb);
    }

    public ArrayList<String> getlEffets(){
        ArrayList<String> ltmp = new ArrayList<String>();
        for(Map.Entry<Effet, Integer> entry : this.lEffets.entrySet()){
            ltmp.add(entry.getKey().getNom());
        }
        return ltmp;
    }

    public void startScenario(Bandeau b){
        for(Map.Entry<Effet, Integer> entry : this.lEffets.entrySet()){
            for(int i = 0; i < entry.getValue(); i++){
                entry.getKey().start(b);
            }
        }
        b.close();
    }
}
