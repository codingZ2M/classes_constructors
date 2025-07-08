package structural.design.pattern.flyweight.pattern;

// The Flyweight (TreeType)
// ✅ Purpose: Represents the shared (intrinsic) state of a tree — things that are common among many trees of the same type.

/*
	What it does:
		Stores shared data: name, color, texture (expensive to duplicate)
		Has a draw(x, y) method that knows how to draw the tree at a given position
*/

class TreeType {
	
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " " + name + " " + texture + " tree at (" + x + "," + y + ")");
    }
}

