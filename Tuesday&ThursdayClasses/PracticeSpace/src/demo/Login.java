package demo;

public class Login {
	
	public String username;
	public String pwd;
	
	public void setUserName(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		if (username == "John") {
			return "Username is correct, please enter password";
		}else {
			return "Username is Incorrect";
		}
	}
	
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getpwd() {
		if(pwd == "John1234") {
			return "Please go ahead";
		}else {
			return "Entered Passsword is Invalid";
		}
	}

}
