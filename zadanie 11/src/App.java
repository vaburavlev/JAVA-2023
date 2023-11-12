public class App {
    public static void main(String[] args) {
        // Создаем настройки приложения
        AppSettings defaultSettings = new AppSettings();
        defaultSettings.setSetting("language", "English");
        defaultSettings.setSetting("theme", "Light");

        // Создаем пользователя и устанавливаем его настройки
        User user1 = new User("User1", defaultSettings);

        // Клонируем настройки для второго пользователя
        AppSettings user2Settings = user1.getAppSettings().clone();
        user2Settings.setSetting("language", "French");

        // Создаем второго пользователя и устанавливаем его настройки
        User user2 = new User("User2", user2Settings);

        // Выводим настройки для обоих пользователей
        System.out.println("User1 Settings:");
        System.out.println("Language: " + user1.getAppSettings().getSetting("language"));
        System.out.println("Theme: " + user1.getAppSettings().getSetting("theme"));

        System.out.println("User2 Settings:");
        System.out.println("Language: " + user2.getAppSettings().getSetting("language"));
        System.out.println("Theme: " + user2.getAppSettings().getSetting("theme"));
    }
}