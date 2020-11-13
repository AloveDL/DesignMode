package KWIC.pipelines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort extends StringList{
	public Sort(ArrayList<String> stringList){
		super(stringList);
	}

	@Override
	public void run() {
		Comparator c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.compareTo(o2)==0)
					return 0;
					//注意！！返回值必须是一对相反数，否则无效。jdk1.7以后就是这样。
					//		else return 0; //无效
				else if(o1.compareTo(o2)<0)
					return -1;
				else
					return 1;
			}
		};
		Collections.sort(stringList,c);
		outputList = stringList;
		System.out.println("排序完成");
	}
	public ArrayList<String> getOutputList(){
		return outputList;
	}
}
