package structural.design.pattern.bridge.pattern;


/*
 * This is a refined abstraction (a specific type of Remote).
 * It interacts with the Device through the common interface.
 */

// Create a concrete Remote
class BasicRemote extends Remote {
	
    private boolean on = false;

    public BasicRemote(Device device) { 
    	super(device);
    	
    }

    @Override
    public void togglePower() {
        if (on) {
            device.turnOff();
        } else {
            device.turnOn();
        }
        on = !on;
    }
}
