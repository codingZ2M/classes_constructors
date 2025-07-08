package structural.design.pattern.flyweight.pattern;

// (The Context Object)
// Represents a specific tree — with its own position, but using a shared TreeType.
class Tree {
    private int x, y; // Unique to each tree
    private TreeType type; // Shared

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y); // Delegate to shared type
    }
}

/*
 	🔍 What it does:
		Stores unique data: position (x, y)
		Delegates drawing to the TreeType (shared part)
	🧠 Think of it like a marker on a map, pointing to where this tree is placed.
	
	All Tree objects of the same type (like "Oak") share one TreeType object.
*/