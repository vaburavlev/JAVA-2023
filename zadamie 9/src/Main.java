
// Пример использования
public class Main {
    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManager.getInstance();

        // Загружаем и получаем ресурсы
        Resource image1 = resourceManager.getResource("картинка1.png");
        Resource font1 = resourceManager.getResource("font1.ttf");
        Resource image2 = resourceManager.getResource("картинка2.png");

        // Используем ресурсы
        image1.display();
        font1.display();
        image2.display();
    }
}