package Assignment;
import java.util.*;

public class day{
	String date;
	List<String> tasks;
	
	public day(){
		date = "";
		tasks = new LinkedList<String>();
	}
	public day(String date){
		this.date = date;
		tasks = new LinkedList<String>();
	}
	public day(String date, String toDO){
		this.date = date;
		tasks = new LinkedList<String>();
		tasks.add(toDO);
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<String> getTasks() {
		return tasks;
	}
	public void setTasks(List<String> tasks) {
		this.tasks = tasks;
	}
	public void addTasks(String take){
		tasks.add(take);
	}
	public String toString(){
		String toReturn = "\n";
		for(String k: tasks){
			toReturn+= k+"\n";
		}
		return toReturn;
	}
}
