package commandPattern.undo;

public interface Command {
	public void execute();
	public void undo();
}
