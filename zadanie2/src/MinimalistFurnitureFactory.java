class MinimalistFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MinimalistChair();
    }

    @Override
    public Table createTable() {
        return new MinimalistTable();
    }
}
