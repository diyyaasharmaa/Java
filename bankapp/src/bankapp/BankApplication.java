package bankapp;

import java.util.Scanner;
class Customerr{
	String pass;
	Customerr(String pass){
		this.pass=pass;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number");
		int accNo= sc.nextInt();
		System.out.println("customer's acc no is"+accNo);
		}
		
		public String getpass() {
			return pass;
			
		}
	
		}

class Adminn{
	String password;
	Customerr cust;
	Adminn(String password){
		this.password=password;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your id number");
		int idNo= sc.nextInt();
		System.out.println("admin's id number is"+idNo);
		}
	
		
		public void setpass(Customerr cust) {
			this.cust= cust;
			
		}
		
		void disp() {
				System.out.println("The customer's accno is "+cust);
			
			
			
	}
}

public class BankApplication {
	public static void main(String[] args) {
		Customerr c= new Customerr("");
		c.main(args);
		Adminn a= new Adminn ("");
		a.main(args);
		a.disp();
		
		 
	}

}
