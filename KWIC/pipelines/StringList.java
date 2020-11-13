package KWIC.pipelines;

import java.util.ArrayList;
import java.util.List;

public abstract class StringList {
	protected ArrayList<String> stringList;
	protected ArrayList<String> outputList;
	public StringList() {

	}

	public StringList(ArrayList<String> stringList) {
		this.stringList = stringList;
		this.outputList = new ArrayList<String>();
	}

	public abstract void run();
}