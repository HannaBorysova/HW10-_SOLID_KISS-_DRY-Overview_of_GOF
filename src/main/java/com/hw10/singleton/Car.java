package main.java.com.hw10.singleton;

public class Car {
    private static Car instance;
    private static String name;

    public static String getName() {
        return name;
    }

    private Car(String name) {
        this.name = name;
    }

    public static Car getInstance(String name) {
        if (instance == null) {
            instance = new Car(name);
        }
        return instance;
    }
}
