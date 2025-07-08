package structural.design.pattern.flyweight.pattern;

import java.util.ArrayList;
import java.util.List;

// The Client / Manager
// ✅ Purpose: Manages all the trees in the forest. It uses a TreeFactory to avoid duplicating tree types.

class Forest {
	
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
    	
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void drawForest() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}

/*
  🔍 What it does:
		Allows you to plant trees by providing position and type
		Uses TreeFactory to reuse shared TreeType objects
		Stores a list of Tree objects
		Draws the entire forest
		
	🧠 Think of it as the map or scene manager for trees in your world.
 */
