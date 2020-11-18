package KWIC.OOP;

import java.io.*;
import java.util.*;

public class Handle {
	private ArrayList<String> stringList;
	private ArrayList<String> outputList;
	private String loadPath;
	private String savePath;


	public Handle(String loadPath,String savePath){
		this.stringList = new ArrayList<String>();
		this.outputList = new ArrayList<String>();
		this.loadPath = loadPath;
		this.savePath = savePath;
	}
	public void load(){
		try
		{
			String encoding = "GBK";
			File file = new File(loadPath);
			if (file.isFile() && file.exists())
			{ // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;

				while ((lineTxt = bufferedReader.readLine()) != null)
				{

					outputList.add(lineTxt);

				}
				bufferedReader.close();
				read.close();
				System.out.println("加载完成");
			}
			else
			{
				System.out.println("找不到指定的文件");
			}
		}
		catch (Exception e)
		{
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}

	}
	public void shifter(){
		stringList = new ArrayList<>(outputList);
		outputList.clear();

		for(Iterator it = stringList.iterator(); it.hasNext();){
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

	public void sort() {
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
		stringList = new ArrayList<>(outputList);
		outputList.clear();
		Collections.sort(stringList,c);
		outputList = new ArrayList<>(stringList);
		System.out.println("排序完成");
//		System.out.println(outputList);
	}
	public void save() {
		try {
			stringList  = new ArrayList<>(outputList);
			BufferedWriter bw = new BufferedWriter(new FileWriter(savePath));
			// 遍历集合
			for (String s : stringList) {
				// 写数据
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
			// 释放资源
			bw.close();
			System.out.println("保存完成");
		}
		catch (Exception e)
		{
			System.out.println("保存文件出错");
			e.printStackTrace();
		}
	}
}
