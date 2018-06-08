package Assignment;
import java.util.*;
import javax.swing.*;

public class controller implements AppController{
	AppView views;
	toDOolist listings;
	String input, viewName;
	
	public controller(){
		appInit();
	}
	public void appInit() {
		listings = new toDOolist();
		listings.add("1/27/2018", "Running");
		listings.add("2/27/2018", "Jumping");
		listings.add("1/27/2018", "Football");
		listings.add("1/27/2018", "Flying");
		listings.add("3/12/2018", "Diving");
	}	
	public void setView(String viewName) {
		this.viewName = viewName;
		if(viewName.equalsIgnoreCase("console"))
			views = new ConsoleAppView(listings);
		else if(viewName.equalsIgnoreCase("second"))
			views = new ConsoleAppView2(listings);
		else views = null;
		if(views == null)	
		System.exit(1);
	}	

	@Override
	public void run() {
		do{
			input = views.getInput("Add (a), Retrieve (r) a toDo, or quit (q)? ");
			if(input.equalsIgnoreCase("a")){
				String date = views.getInput("Enter date --> ");
				String doing = views.getInput("Enter what your doing --> ");
				listings.add(date, doing);
				views.display("Current toDo size: " + listings.getSize());
			}
			else if(input.equalsIgnoreCase("r")){
				input = views.getInput("Enter date --> ");
				views.display("Doing: " + views.getResult());
			}
			else {
				break; 
			}
		}while(true);		
	}	
}
class ConsoleAppView implements AppView {
	private Scanner sc;
	String input;
	toDOolist doing;
	
	public ConsoleAppView(toDOolist listings) {
		doing = listings;
		sc = new Scanner(System.in);
	}
	@Override
	public String getInput(String prompt) {
		System.out.println(prompt);
		input = sc.nextLine();
		return input;
	}
	@Override
	public String getResult() {
		String result = doing.getToDoList(input.trim());
		return result;
	}
	@Override
	public void display(String msg) {
		System.out.println(msg);
		
	}
}
class ConsoleAppView2 implements AppView {
	private Scanner sc;
	String input;
	toDOolist doing;	
	public ConsoleAppView2(toDOolist listings) {
		doing = listings;
		sc = new Scanner(System.in);
	}
	@Override
	public String getInput(String prompt) {
		System.out.println("****"+ prompt+"****");
		input = sc.nextLine();		
		return input;
	}
	@Override
	public String getResult() {
		String result = doing.getToDoList(input.trim());
		return result;
	}
	@Override
	public void display(String msg) {
		System.out.println(msg);
	}
}