package bankapp;

public class Customer {
	private String cusername;
	private String cpassword;
	
	Customer(String cusername, String cpassword)
	{
		this.cusername= cusername;
		this.cpassword= cpassword;
	}
	
	public String getCusername() {
		return cusername;
	}
	
	public String getCpassword() {
		return cpassword;
	}
}


