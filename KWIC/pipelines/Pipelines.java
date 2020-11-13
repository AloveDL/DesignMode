package KWIC.pipelines;

public class Pipelines {
	protected String loadPath;
	protected String savePath;
	protected LoadData loadData ;
	protected Pipe pipe1  ;
	protected Shifter shifter ;
	protected Pipe pipe2 ;
	protected Sort sort;
	protected Pipe pipe3 ;
	protected SaveData saveData ;


	public Pipelines(){}
	public Pipelines(String loadPath,String savePath){
		this.loadPath= loadPath;
		this.savePath = savePath;
	}
	public void run(){
		loadData = new LoadData(loadPath);
		loadData.run();

		pipe1 = new Pipe(loadData.getOutputList());
		pipe1.run();

		shifter = new Shifter(pipe1.getOutput());
		shifter.run();

		pipe2 = new Pipe(shifter.getOutputList());
		pipe2.run();

		sort = new Sort(pipe2.getOutput());
		sort.run();

		pipe3 = new Pipe(sort.getOutputList());
		pipe3.run();

		saveData = new SaveData(pipe3.getOutput(),savePath);
		saveData.run();
		System.out.println("程序结束");
	}

}
