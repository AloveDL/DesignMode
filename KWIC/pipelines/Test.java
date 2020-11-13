package KWIC.pipelines;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {

			Pipelines pipelines = new Pipelines("KWIC\\pipelines\\text","KWIC\\pipelines\\newtext");
			pipelines.run();

	}
}
