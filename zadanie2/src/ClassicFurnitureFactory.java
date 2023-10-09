// Конкретные фабрики для разных стилей интерьера
class ClassicFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }
    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
