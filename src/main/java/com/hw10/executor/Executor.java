package main.java.com.hw10.executor;

import main.java.com.hw10.builder.House;
import main.java.com.hw10.builder.HouseBuilder;
import main.java.com.hw10.builder.ParadiseHouse;
import main.java.com.hw10.builder.Realtor;
import main.java.com.hw10.singleton.Car;

public class Executor {
    public static void execute() {
        builderRunner();
        singletonRunner();
    }

    public static void builderRunner() {
        Realtor realtor = new Realtor();
        HouseBuilder paradiseHouse = new ParadiseHouse();
        realtor.setHouseBuilder(paradiseHouse);
        realtor.setShowHouse();

        House house = realtor.getHouse();
        System.out.println(house);
    }

    private static void singletonRunner() {
        Car.getInstance("Pink Fiat");
        System.out.println(Car.name);
        Car.getInstance("Red Fiat");
        System.out.println(Car.name);
    }
}
