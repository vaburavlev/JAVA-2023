public class FurnitureProductionSystem {
    public static void main(String[] args) {
// Создаем фабрику для классического стиля интерьера
        FurnitureFactory classicFactory = new ClassicFurnitureFactory();
        Chair classicChair = classicFactory.createChair();
        Table classicTable = classicFactory.createTable();

// Создаем фабрику для современного стиля интерьера
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

// Создаем фабрику для минималистичного стиля интерьера
        FurnitureFactory minimalistFactory = new MinimalistFurnitureFactory();
        Chair minimalistChair = minimalistFactory.createChair();
        Table minimalistTable = minimalistFactory.createTable();

// Тестируем созданные предметы мебели
        classicChair.sitOn();
        classicTable.placeItem();

        modernChair.sitOn();
        modernTable.placeItem();

        minimalistChair.sitOn();
        minimalistTable.placeItem();
    }
}
