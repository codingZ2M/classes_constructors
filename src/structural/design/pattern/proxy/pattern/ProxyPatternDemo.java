package structural.design.pattern.proxy.pattern;


/*
 	Proxy Pattern
		Purpose: Provides a surrogate or placeholder for another object to control access.

	✅ Real-World Analogy:
		A security guard (proxy) checks your ID before allowing access to a restricted area.
 */

public class ProxyPatternDemo {
	
    public static void main(String[] args) {
    
    	Internet internet = new ProxyInternet();
        internet.connectTo("example.com");
        internet.connectTo("abc.com");
    }
    
}