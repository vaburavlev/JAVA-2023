// Класс конкретного ресурса (например, изображения)
class ImageResource implements Resource {
    private String name;

    public ImageResource(String name) {
        this.name = name;
        // Здесь можно добавить логику загрузки изображения
        System.out.println("Loading image: " + name);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + name);
    }
}
