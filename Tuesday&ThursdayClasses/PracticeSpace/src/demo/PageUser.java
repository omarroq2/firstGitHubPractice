package demo;

public class PageUser {
	
	public static void main(String[] args) {
		Login lg1 = new Login();
		lg1.setUserName("John");
		System.out.println(lg1.getUsername());
		lg1.setpwd("John@1234");
		System.out.println(lg1.getpwd());
	}

}
