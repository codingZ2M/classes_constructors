package behavioral.design.patterns.command;

public interface Command {
    void execute();
    void undo();  // Optional: for undo functionality
}
