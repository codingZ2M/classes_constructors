package behavioral.design.patterns.command;

import java.util.Stack;

public class SmartHomeController {
	// Represents a last-in-first-out (LIFO) stack of objects. 
	// Delay or Queue a Request:
	// 💡 The command can be stored, delayed, and executed later — very useful for task queues, batch jobs, etc.
    private Stack<Command> commandHistory = new Stack<>();

    public void submit(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command last = commandHistory.pop();
            last.undo();
        } else {
            System.out.println("🔁 Nothing to undo");
        }
    }
}
