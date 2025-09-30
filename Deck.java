import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cartas;

    public Deck() {
        cartas = new ArrayList<>();
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Negro", "Rojo"};
        String[] valores = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for (String palo : palos) {
            String color = (palo.equals("Corazones") || palo.equals("Diamantes")) ? colores[1] : colores[0];
            for (String valor : valores) {
                cartas.add(new Card(palo, color, valor));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cartas.isEmpty()) {
            Card c = cartas.remove(0);
            System.out.println(c);
            System.out.println("Quedan " + cartas.size() + " cartas en deck");
        }
    }

    public void pick() {
        if (!cartas.isEmpty()) {
            Random rand = new Random();
            int index = rand.nextInt(cartas.size());
            Card c = cartas.remove(index);
            System.out.println(c);
            System.out.println("Quedan " + cartas.size() + " cartas en deck");
        }
    }

    public void hand() {
        if (cartas.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card c = cartas.remove(0);
                System.out.println(c);
            }
            System.out.println("Quedan " + cartas.size() + " cartas en deck");
        }
    }
}
