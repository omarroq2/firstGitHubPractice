package demo;

public class App {
	
		int monthnum;
		
		public static void main(String[] args) {
			
			//upcasting
			Student s1 = new Admin();
			s1.view();
			
			
			//downcasting
			Admin a1 = (Admin) s1;
			a1.edit();
			a1.view();
			
			
			
		}
		

}
