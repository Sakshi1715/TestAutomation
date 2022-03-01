package DOMElements;

public class PageElements {

	public String signIn() {
		return "//a[contains(text(),'Sign in')]";
	}
	
	public String userid() {
		return "//input[@name='uid']";
	}
	
	public String password() {
		return "//input[@name='password']";
	}
	
	public String loginbutton() {
		return "//input[@name='btnLogin']";
	}
	
	
}
