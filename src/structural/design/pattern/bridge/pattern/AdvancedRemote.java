package structural.design.pattern.bridge.pattern;

class AdvancedRemote extends Remote {
    private boolean on = false;

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (on) device.turnOff();
        else device.turnOn();
        on = !on;
    }

    public void mute() {
        device.mute();
    }
}

