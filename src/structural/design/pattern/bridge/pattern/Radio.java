package structural.design.pattern.bridge.pattern;

class Radio implements Device {
	
    public void turnOn() { 
    	System.out.println("Radio is ON");
    	}
    
    public void turnOff() { 
    	System.out.println("Radio is OFF");
    	}
    
    public void mute() { 
    	System.out.println("Radio is muted"); 
    }
}
