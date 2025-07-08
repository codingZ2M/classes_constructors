package structural.design.pattern.flyweight.pattern;


/*
   Flyweight Pattern: Minimizes memory usage by sharing as much data as possible with similar objects.	
 */

/*
   ✅ Real-World Scenario: Rendering a Forest with Thousands of Trees 🌳
		Imagine you are building a game with a large forest. Each tree has:

		A position (x, y)
		A type (e.g., oak, pine), which includes:
			name
			texture
			color
			shape data, etc.

	If you create a new object for every single tree, you’ll waste tons of memory storing duplicate tree types.


    🎯 Problem: You have 1,000,000 Trees in a game
		Each tree has:
						Position (x, y) — ❗ unique per tree
						Type (name, color, texture) — ✅ many trees share the same

		If you create 1,000,000 Tree objects, and each one also stores its own copy of name, color, texture, you'll waste massive memory.


	🪄 Solution: Flyweight Pattern
		You store shared state (tree type) only once, and reuse it.
 */

public class Main {
    public static void main(String[] args) {
    	
        Forest forest = new Forest();

        forest.plantTree(1, 1, "Oak", "Green", "Rough");
        forest.plantTree(2, 3, "Oak", "Green", "Rough");
        forest.plantTree(5, 8, "Pine", "Dark Green", "Smooth");

        forest.drawForest();
    }
}


/*
 	✅ How It Saves Memory
		All Oak trees share the same TreeType object.
		All Pine trees share another.
		You avoid storing texture, color, shape repeatedly for every single tree.
		
		Only 1 TreeType object for all Oak trees, even if you have 500,000 of them!
*/