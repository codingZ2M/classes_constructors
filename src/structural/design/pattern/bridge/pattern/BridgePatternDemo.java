package structural.design.pattern.bridge.pattern;

/*
  Bridge Pattern:
	🔧 Purpose: Separates abstraction from implementation so that both can evolve independently.
				Abstraction → Remote
				Implementation → Device
	✅ Real-World Analogy:
		A remote control is an abstraction for a device like a TV or radio. You can extend remotes or 
		devices without affecting each other.
 */


/*
 🧩 Without Bridge Pattern:
	If every remote is hardcoded to control only a TV or only a Radio, you would need:
		TVRemote
		RadioRemote
	If you add a new device (e.g., Projector), you must create new remotes too. This couples the remote directly to the device. 
 
 */

public class BridgePatternDemo {
    public static void main(String[] args) {
    	
        Remote remote = new BasicRemote(new TV());
        remote.togglePower();
        remote.togglePower();

        Remote radioRemote = new BasicRemote(new Radio());
        radioRemote.togglePower();
        radioRemote.togglePower();
      
        
        AdvancedRemote advancedRemote;
        advancedRemote = new AdvancedRemote(new TV());
        advancedRemote.mute();        // Mute TV
        
       advancedRemote= new AdvancedRemote(new Radio());
        advancedRemote.mute();        // Mute Radio
        
    }
}