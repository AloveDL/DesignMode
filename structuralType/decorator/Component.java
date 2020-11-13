package structuralType.decorator;

public abstract class Component implements IComputer{
	protected IComputer computer;
	public Component(IComputer computer){
		this.computer = computer;
	}
}
