package behavioral.design.patterns.command;

public class Main {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController();

        Light livingRoomLight = new Light();
        Fan bedroomFan = new Fan();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command fanOff = new FanOffCommand(bedroomFan);

        // Parameterize objects with different requests:
        // Passing command objects (LightOnCommand, FanOffCommand) to SmartHomeController.
        // Assigning different behaviors to the invoker without changing its logic.
        controller.submit(lightOn);  // 💡 Light is ON
        controller.submit(fanOff);   // 🌀 Fan is STOPPED

        // Undo last action
        controller.undoLastCommand(); // 🌀 Fan is RUNNING
        controller.undoLastCommand(); // 💡 Light is OFF
    }
}

