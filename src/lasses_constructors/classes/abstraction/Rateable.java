package lasses_constructors.classes.abstraction;

public interface Rateable {
	
    default void giveRating(int stars) {
        System.out.println("⭐ Thank you for rating us " + stars + " stars!");
    }
    
}

