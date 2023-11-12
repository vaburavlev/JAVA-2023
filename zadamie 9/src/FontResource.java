// Класс конкретного ресурса (например, шрифта)
class FontResource implements Resource {
    private String name;

    public FontResource(String name) {
        this.name = name;
        // Здесь можно добавить логику загрузки шрифта
        System.out.println("Loading font: " + name);
    }

    @Override
    public void display() {
        System.out.println("Displaying text with font: " + name);
    }
}
