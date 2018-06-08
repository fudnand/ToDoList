package Assignment;

import java.util.*;
public class toDOolist implements Ilist{
	private List<day> dates;	
	
	public toDOolist(){
		dates = new LinkedList<day>();
	}
	public void add(String date, String toDo) {
		if (date==null || toDo == null) return;
		if(dates.size() ==0){
			dates.add(new day(date, toDo));
			return;
		}
		if(!contains(date)){
			dates.add(new day(date, toDo));
			//return;
		}	
		else{
			day put = find(date);
			put.addTasks(toDo);
		}
	}	
	public day find(String date){
		for(day k: dates ){
			if(k.getDate().equalsIgnoreCase(date))
				return k;
		}
		return null;
	}	
	public List<day> getDates(){
		return dates;
	}
	public boolean contains(String thisDate){
		for(day k: getDates() ){
			if(k.getDate().equalsIgnoreCase(thisDate))
				return true;
		}
		return false;
	}
	public void remove(String date) {
		if(dates.size() == 0) return;
		else{
			dates.remove(find(date));
		}
	}
	public String getToDoList(String date) {
		return find(date).toString();
	}
	public int getSize() {
		return dates.size();
	}
	public String toString(){
		String toReturn = "";
		for(day r: dates){
			toReturn += r.toString()+ "\n";
			}
		
		return toReturn;
	}
}