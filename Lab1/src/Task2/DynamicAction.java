package Task2;

public class DynamicAction extends Action{
	private String name;

	public DynamicAction(String name) {
		this.name = name;
	}

	public boolean isNoOp() {
		return false;
	}
	@Override
	public String toString() {
		return this.name;
	}
}