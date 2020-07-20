package main.java.com.hw10.builder;

public abstract class HouseBuilder {
    protected House house;

    public House getHouse() {
        return house;
    }

    public void showNewHouse() {
        house = new House();
    }

    public abstract void buuldType();
    public abstract void buuldLocation();
    public abstract void buuldEquipment();
    public abstract void buuldRawMaterials();
    public abstract void buuldAddParameters();
    public abstract void buuldPrice();
}
