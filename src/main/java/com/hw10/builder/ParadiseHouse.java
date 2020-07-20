package main.java.com.hw10.builder;

import main.java.com.hw10.builder.enums.Equipment;
import main.java.com.hw10.builder.enums.Location;
import main.java.com.hw10.builder.enums.Type;

public class ParadiseHouse extends HouseBuilder {

    @Override
    public void buuldType() {
        house.setType(Type.LUXE);
    }

    @Override
    public void buuldLocation() {
        house.setLocation(Location.SUBURB);
    }

    @Override
    public void buuldEquipment() {
        house.setEquipment(Equipment.FULL_EQUIPMENT);
    }

    @Override
    public void buuldRawMaterials() {
        house.setRawMaterials("Сeramic blocks");
    }

    @Override
    public void buuldAddParameters() {
        house.setAddParameters("Firts sea line");
    }

    @Override
    public void buuldPrice() {
        house.setPrice("350 000,00 usd");
    }
}
