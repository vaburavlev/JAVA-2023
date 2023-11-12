import java.util.ArrayList;
import java.util.List;

public class GameCareTaker {
    private List<GameMemento> mementos = new ArrayList<>();

    public void addMemento(GameMemento memento) {
        mementos.add(memento);
    }

    public GameMemento getMemento(int index) {
        return mementos.get(index);
    }
}