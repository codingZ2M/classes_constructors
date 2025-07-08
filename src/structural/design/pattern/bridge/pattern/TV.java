package structural.design.pattern.bridge.pattern;

class TV implements Device {
	
    public void turnOn() { 
    	System.out.println("TV is ON");
    	}
    
    public void turnOff() {
    	System.out.println("TV is OFF");
    }
    
    
    public void mute() { 
    	System.out.println("TV is muted"); 
    }
    
}