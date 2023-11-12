public class GameOriginator {
    private String player;
    private int level;
    private int score;

    public void setGame(String player, int level, int score) {
        this.player = player;
        this.level = level;
        this.score = score;
    }

    public GameMemento saveGame() {
        return new GameMemento(player, level, score);
    }

    public void restoreGame(GameMemento memento) {
        this.player = memento.getPlayer();
        this.level = memento.getLevel();
        this.score = memento.getScore();
    }

    public void displayGame() {
        System.out.println("Player: " + player);
        System.out.println("Level: " + level);
        System.out.println("Score: " + score);
    }
}