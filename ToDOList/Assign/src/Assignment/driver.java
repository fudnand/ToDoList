package Assignment;
import java.util.*;
public class driver {

	public static void main(String[] args) {
		AppController app = new controller();
		app.setView("console");
		app.run();
		
		AppController app2 = new controller();
		app2.setView("second");
		app2.run();
	}
}
