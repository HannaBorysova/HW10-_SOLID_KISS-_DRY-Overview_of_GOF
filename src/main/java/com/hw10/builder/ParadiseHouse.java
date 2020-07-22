package main.java.com.hw10.builder;

import main.java.com.hw10.builder.enums.Equipment;
import main.java.com.hw10.builder.enums.Location;
import main.java.com.hw10.builder.enums.Type;

public class ParadiseHouse extends HouseBuilder {

    @Override
    public void buildType() {
        house.setType(Type.LUXE);
    }

    @Override
    public void buildLocation() {
        house.setLocation(Location.SUBURB);
    }

    @Override
    public void buildEquipment() {
        house.setEquipment(Equipment.FULL_EQUIPMENT);
    }

    @Override
    public void buildRawMaterials() {
        house.setRawMaterials("Сeramic blocks");
    }

    @Override
    public void buildAddParameters() {
        house.setAddParameters("Firts sea line");
    }

    @Override
    public void buildPrice() {
        house.setPrice("350 000,00 usd");
    }
}
