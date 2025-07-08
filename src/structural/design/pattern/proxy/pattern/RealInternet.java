package structural.design.pattern.proxy.pattern;

class RealInternet implements Internet {
	
    public void connectTo(String site) {
        System.out.println("Connecting to " + site);
    }
    
}