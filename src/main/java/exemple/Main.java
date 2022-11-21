package exemple;

import bandeau.Bandeau;

public class Main {
    public static void main(String[] args) {
        Bandeau b = new Bandeau();
        Scenario s = new Scenario();
        Effet1 e1 = new Effet1("Aléatoire");
        Effet2 e2 = new Effet2("Petit à petit");
        Effet3 e3 = new Effet3("Pleins de choses");

        s.addEffet(e1, 1);
        s.addEffet(e2, 2);
        s.addEffet(e3, 3);
      
        s.startScenario(b);
    }
}
