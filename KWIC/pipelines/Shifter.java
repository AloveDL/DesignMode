package KWIC.pipelines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shifter extends StringList{

	public Shifter(ArrayList<String> inputStringList){
		super(inputStringList);
	}

	public void run(){
		for(Iterator it = stringList.iterator();it.hasNext();){
			Object item = it.next();
			search((String) item);

		}
		System.out.println("移位完成");
	}
	private void search(String item){
		String[] result = item.split(" " );

		int len = result.length;
		outputList.add(item);
		for(int i = 0;i<len-1;i++){
			String temp = result[0];
			for(int j=0;j<len-1;j++){
				result[j] = result[j+1];
			}
			result[len-1] = temp;

			outputList.add(join(result));
		}
	}

	private String join(String[] strlist){
		String result = "";
		for(int i=0;i<strlist.length;i++){
			result += strlist[i];
			if(i!=strlist.length-1){
				result+=" ";
			}
		}
		return result;
	}
	public ArrayList<String> getOutputList(){
		return outputList;
	}
}
