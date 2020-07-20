package main.java.com.hw10.builder;

import main.java.com.hw10.builder.enums.Equipment;
import main.java.com.hw10.builder.enums.Location;
import main.java.com.hw10.builder.enums.Type;

public class FamilyHouse extends HouseBuilder {
    @Override
    public void buuldType() {
        house.setType(Type.ECONOMY_CLASS);
    }

    @Override
    public void buuldLocation() {
        house.setLocation(Location.NEAR_THE_METRO);
    }

    @Override
    public void buuldEquipment() {
        house.setEquipment(Equipment.WITHOUT_EQUIPMENT);
    }

    @Override
    public void buuldRawMaterials() {
        house.setRawMaterials("Frame house");
    }

    @Override
    public void buuldAddParameters() {
        house.setAddParameters("Good infrastructure, near a school, " +
                "kindergarten, shopping malls, supermarket, cinema");
    }

    @Override
    public void buuldPrice() {
        house.setPrice("120 000.00 usd");
    }
}
