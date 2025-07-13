package behavioral.design.patterns.command;

// Support infeasible/unattainable operations.
// 💡 The command object stores what needs to be done and how to undo
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }

    //The undo() method is implemented by reversing the action.
    public void undo() {
        light.turnOff();
    }
}
