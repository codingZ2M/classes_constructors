package lasses_constructors.classes.abstraction;

public interface Trackable {
    default void trackLocation() {
        System.out.println("📍 Ride is on the way... Tracking enabled.");
    }
}

