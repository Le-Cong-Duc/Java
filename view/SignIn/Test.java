package SignIn;

import Menu.Menu;

import SignUp.SignUp;

public class Test {
public static void main(String[] args) {
	 SignIn signIn = new SignIn();
	 signIn.setVisible(true);
	 signIn.setLocationRelativeTo(null);
	
	 SignUp signUp = new SignUp();
	 signUp.setVisible(true);
	 signUp.setLocationRelativeTo(null);
	 
	 Menu menu = new Menu();
	 menu.setVisible(true);
	 menu.setLocationRelativeTo(null);
	
	 
	
}
}
