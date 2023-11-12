public class Main {
    public static void main(String[] args) {
        GameOriginator game = new GameOriginator();
        GameCareTaker careTaker = new GameCareTaker();

        // Установка и сохранение состояния игры
        game.setGame("Player 1", 1, 1000);
        careTaker.addMemento(game.saveGame());

        // Вывод текущего состояния игры
        game.displayGame();

        // Изменение состояния игры
        game.setGame("Player 1",3, 1500);
        careTaker.addMemento(game.saveGame());

        // Восстановление предыдущего состояния игры
        game.restoreGame(careTaker.getMemento(1));

        // Вывод восстановленного состояния игры
        game.displayGame();
    }
}