package main.java.com.hw10.executor;

import main.java.com.hw10.builder.*;
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

        Realtor realtorFamily = new Realtor();
        HouseBuilder familyHouse = new FamilyHouse();
        realtorFamily.setHouseBuilder(familyHouse);
        realtorFamily.setShowHouse();
        House houseFamily = realtorFamily.getHouse();
        System.out.println(houseFamily);
    }

    private static void singletonRunner() {
        Car.getInstance("Pink Fiat");
        System.out.println(Car.getName());
        Car.getInstance("Red Fiat");
        System.out.println(Car.getName());

        Car car = Car.getInstance(Car.getName());
        Car car1 = Car.getInstance(Car.getName());
        System.out.println(car.equals(car1));
    }
}
