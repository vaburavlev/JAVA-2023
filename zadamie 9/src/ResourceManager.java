import java.util.HashMap;
import java.util.Map;

// Менеджер ресурсов (реализация Одиночки)
class ResourceManager {
    private static ResourceManager instance;
    private Map<String, Resource> resourceCache;

    private ResourceManager() {
        // Приватный конструктор
        resourceCache = new HashMap<>();
    }

    public static synchronized ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public Resource getResource(String key) {
        // Проверяем, есть ли ресурс в кэше
        Resource resource = resourceCache.get(key);

        // Если ресурс отсутствует, создаем и добавляем его в кэш
        if (resource == null) {
            if (key.endsWith(".png")) {
                resource = new ImageResource(key);
            } else if (key.endsWith(".ttf")) {
                resource = new FontResource(key);
            }
            resourceCache.put(key, resource);
        }

        return resource;
    }
}