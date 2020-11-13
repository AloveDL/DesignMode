package structuralType.decorator;

public class Mouse extends Component{

	public Mouse(IComputer computer) {
		super(computer);
	}

	@Override
	public void show() {
		computer.show();
		System.out.println("带有鼠标");
	}
}
