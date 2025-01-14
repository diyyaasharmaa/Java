package bankapp;

public class Bank {
	String bankName;
	Admin admin;
	Customer customer;
	
	Bank(String bankName){
		this.bankName= bankName; 
	}
	
	public void setUsername(Admin admin) {
		this.admin = admin;
	}
	
	 public void setPassword(Admin admin) {
		 this.admin = admin;
	 }
	 
	 public void setCusername(Customer customer) {
		 this.customer=customer;
	 }
	 
	 public void setCpassword(Customer customer) {
		 this.customer=customer;
	 }
	 void disp() {
		 System.out.println("admin name "+admin.getUsername()+" password "+admin.getPass());
		 System.out.println("customer name "+customer.getCusername()+" password "+customer.getCpassword());
	 }
	 
	 
	 public static void main(String[] args) {
		Bank b = new Bank("SBI");
		Admin a = new Admin("Aman","1234");
		Customer c = new Customer("Rahul","12345");
		b.setUsername(a);
		b.setPassword(a);
		b.setCusername(c);
		b.setCpassword(c);
		b.disp();
	}

}
