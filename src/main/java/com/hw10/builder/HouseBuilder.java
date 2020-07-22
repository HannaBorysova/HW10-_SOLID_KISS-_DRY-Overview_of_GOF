package main.java.com.hw10.builder;

public abstract class HouseBuilder {
    protected House house;

    public House getHouse() {
        return house;
    }

    public void showNewHouse() {
        house = new House();
    }

    public abstract void buildType();

    public abstract void buildLocation();

    public abstract void buildEquipment();

    public abstract void buildRawMaterials();

    public abstract void buildAddParameters();

    public abstract void buildPrice();
}
