package structural.design.pattern.bridge.pattern;


/*
 * This is the abstraction.
 * It holds a reference to a Device, decoupling the abstraction (Remote) from its implementation (Device).
 		Remote uses Device, not a specific class like TV or Radio.
		This makes Remote reusable with any kind of device, now or in the future.
 */

// This is the Bridge!
// It doesn't care what kind of Device it controls. It could be a TV, Radio, or anything else that implements Device.


abstract class Remote {

	protected Device device;
    
	public Remote(Device device) { 
    	this.device = device;
    	}
    
    abstract void togglePower();
  
}


/*
🔁 In Simple Words:
	The Remote is designed to work with any device, not just a specific one. This is how abstraction and
	 implementation are kept separate — they are "decoupled".
*/