package KWIC.pipelines;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class SaveData extends StringList{
	private String savePath;
	public SaveData(ArrayList<String> stringList,String savePath){
		super(stringList);
		this.savePath = savePath;
	}

	@Override
	public void run() {
		try {
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
