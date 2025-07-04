package creational.design.patterns.singleton.pattern;

/*
  Creational Patterns in Java are a category of design patterns that deal with how objects are created. 
  They aim to make object creation more flexible, controlled, and decoupled from the system that uses those objects. 
 */

/*
 Creational Design Patterns(Singleton Pattern): One and only one instance globally
 💡 Use When:
You need only one instance of a class, globally accessible.

🔧 Real-World Scenario: 
Single database connection pool in an app.

In most applications, we only need one logging instance to write logs throughout the app.
🧠 Why?
We don’t want multiple loggers writing to different outputs.
Singleton ensures one global instance.
 */

class Logger {
    private static Logger instance;

     // private constructor
    // new Logger(); // ❌ This is illegal outside the class
    private Logger() {} 

    
    public static Logger getInstance() {
    	// The first time getInstance() is called, it creates the object.
    	// The second (and every other) time, it simply returns the already created object.
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("Log: " + msg);
    }
}



