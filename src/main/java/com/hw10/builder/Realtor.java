package main.java.com.hw10.builder;

public class Realtor {
    private HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder hb) {
        houseBuilder = hb;
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }

    public void setShowHouse() {
        houseBuilder.showNewHouse();
        houseBuilder.buildType();
        houseBuilder.buildLocation();
        houseBuilder.buildEquipment();
        houseBuilder.buildRawMaterials();
        houseBuilder.buildAddParameters();
        houseBuilder.buildPrice();
    }
}
