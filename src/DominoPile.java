import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DominoPile {
    private List<Domino> pile;

    public DominoPile() {
        this.pile = new ArrayList<>();
    }

    public List<Domino> getPile(){
        return pile;
    }


    public void newStack6() {
        pile.clear();
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                Domino domino = new Domino(i, j);
                pile.add(domino);
            }
        }
    }

    public void shuffle() {
        List<Domino> newPile = new ArrayList<>();
        Random random = new Random();

        while (!pile.isEmpty()) {
            int index = random.nextInt(pile.size());
            Domino domino = pile.remove(index);
            newPile.add(domino);
        }

        pile = newPile;
    }
}