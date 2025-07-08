package structural.design.pattern.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

// The Flyweight Factory (TreeFactory)
// Central place that manages shared objects.

class TreeFactory {
	
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
    	
        String key = name + color + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, texture));
        }
        return treeTypes.get(key);
    }
    
}

/*
 	Only 1 TreeType object is ever created for "Oak-Green-rough", no matter how many trees of that type exist.
*/