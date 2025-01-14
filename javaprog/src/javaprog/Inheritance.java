package javaprog;

class Person{
	String name;
	String address;
	Person(String name,String address){
		this.name=name;
		this.address=address;	
	}
	void disp() {
		System.out.println("the name is "+name+" with address "+address);
	}
}

class Student7 extends Person{
	
	int rollno;
	Student7(String name, String address,int rollno){
		super(name,address);
		this.rollno=rollno;
		}
	
	void disp1() {
		super.disp();
		System.out.println(super.name);
		System.out.println(super.address);
		System.out.println("the roll number "+rollno);
		
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		Student7 s = new Student7("Adarsh","Jabalpur",25);
		s.disp1();
		Student7 s1= new Student7("Diya","Jabalpur",7);
		s1.disp1();
		
	}

}
