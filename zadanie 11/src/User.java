// Класс, представляющий пользователя
class User {
    private String username;
    private AppSettings appSettings;

    public User(String username, AppSettings appSettings) {
        this.username = username;
        this.appSettings = appSettings;
    }

    public AppSettings getAppSettings() {
        return appSettings;
    }
}