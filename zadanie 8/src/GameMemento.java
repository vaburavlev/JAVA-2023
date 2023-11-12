public class GameMemento {
    private String player;
    private int level;
    private int score;

    public GameMemento(String player, int level, int score) {
        this.player = player;
        this.level = level;
        this.score = score;
    }

    public String getPlayer() {
        return player;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
