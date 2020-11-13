package KWIC.pipelines;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
//		LoadData loadData = new LoadData("KWIC\\\\pipelines\\\\text");
//		loadData.run();
//		Shifter shifter = new Shifter(loadData.getOutputList());
//		shifter.run();
//		Sort sort = new Sort(shifter.getOutputList());
//		sort.run();
//		SaveData saveData = new SaveData(sort.getOutputList(),"KWIC\\\\pipelines\\\\newtext");
//		saveData.run();

//		for(Iterator it =loadData.load("KWIC\\pipelines\\text").iterator();it.hasNext();){
//			Object item = it.next();
//			System.out.println(item);
//		}
//		for(Iterator it = sort.getOutputList().iterator();it.hasNext();){
//			Object item = it.next();
//			System.out.println(item);
//		}

			Pipelines pipelines = new Pipelines("KWIC\\pipelines\\text","KWIC\\pipelines\\newtext");
			pipelines.run();

	}
}
