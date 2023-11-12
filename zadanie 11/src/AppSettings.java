import java.util.HashMap;
// Класс, представляющий настройки приложения
class AppSettings implements Cloneable {
    private HashMap<String, String> settings;

    public AppSettings() {
        settings = new HashMap<>();
    }

    // Метод для установки настроек
    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    // Метод для получения настроек по ключу
    public String getSetting(String key) {
        return settings.get(key);
    }

    // Метод для клонирования настроек
    @Override
    public AppSettings clone() {
        AppSettings clonedSettings = new AppSettings();
        clonedSettings.settings.putAll(this.settings);
        return clonedSettings;
    }
}