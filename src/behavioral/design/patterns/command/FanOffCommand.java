package behavioral.design.patterns.command;

//Support infeasible/unattainable operations.
//💡 The command object stores what needs to be done and how to undo
public class FanOffCommand implements Command {
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.stop();
    }

    //The undo() method is implemented by reversing the action.
    public void undo() {
        fan.start();
    }
}
