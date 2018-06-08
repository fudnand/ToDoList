package Assignment;

interface AppView{
	String getInput(String prompt);
	String getResult();
	void display(String msg);
}

interface AppController{
	void appInit();
	void setView(String viewName);
	void run();
}

interface Ilist {
	void add(String date, String toDo);	
	int getSize();	
	void remove(String date); 	
	boolean contains(String date);	
	String getToDoList(String date);
}
