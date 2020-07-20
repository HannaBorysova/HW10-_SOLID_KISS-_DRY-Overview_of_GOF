package main.java.com.hw10.builder;

import main.java.com.hw10.builder.enums.Equipment;
import main.java.com.hw10.builder.enums.Location;
import main.java.com.hw10.builder.enums.Type;

public class House {
    private Type type;
    private Location location;
    private Equipment equipment;
    private String rawMaterials;
    private String addParameters;
    private String price;

    public void setType(Type type) {
        this.type = type;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public void setRawMaterials(String rawMaterials) {
        this.rawMaterials = rawMaterials;
    }

    public void setAddParameters(String addParameters) {
        this.addParameters = addParameters;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "type=" + type +
                ", location=" + location +
                ", equipment=" + equipment +
                ", rawMaterials='" + rawMaterials + '\'' +
                ", addParameters='" + addParameters + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
