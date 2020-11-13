package KWIC.pipelines;

import java.util.ArrayList;
import java.util.List;

public class Pipe {
	private ArrayList<String> input;
	private ArrayList<String> output;

	public Pipe(ArrayList<String> input){
		this.input = input;
	}
	public void setInput(ArrayList<String> input) {
		this.input = input;
	}

	public void setOutput(ArrayList<String> output) {
		this.output = output;
	}

	public ArrayList<String> getInput() {
		return input;
	}

	public ArrayList<String> getOutput() {
		return output;
	}

	public void run(){
		this.output = this.input;
	}
}
