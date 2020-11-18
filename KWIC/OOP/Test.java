package KWIC.OOP;

public class Test {
	public static void main(String[] args) {
		Handle handle = new Handle("KWIC\\OOP\\text","KWIC\\OOP\\newtext");
		handle.load();
		handle.shifter();
		handle.sort();
		handle.save();
	}
}
