package structuralType.decorator;

public class Keyboard extends Component{
	public Keyboard(IComputer computer) {
		super(computer);
	}

	@Override
	public void show() {
		computer.show();
		System.out.println("带有键盘");
	}
}
