package main.java.com.hw10.builder;

import main.java.com.hw10.builder.enums.Equipment;
import main.java.com.hw10.builder.enums.Location;
import main.java.com.hw10.builder.enums.Type;

public class FamilyHouse extends HouseBuilder {
    @Override
    public void buildType() {
        house.setType(Type.ECONOMY_CLASS);
    }

    @Override
    public void buildLocation() {
        house.setLocation(Location.NEAR_THE_METRO);
    }

    @Override
    public void buildEquipment() {
        house.setEquipment(Equipment.WITHOUT_EQUIPMENT);
    }

    @Override
    public void buildRawMaterials() {
        house.setRawMaterials("Frame house");
    }

    @Override
    public void buildAddParameters() {
        house.setAddParameters("Good infrastructure, near a school, " +
                "kindergarten, shopping malls, supermarket, cinema");
    }

    @Override
    public void buildPrice() {
        house.setPrice("120 000.00 usd");
    }
}
