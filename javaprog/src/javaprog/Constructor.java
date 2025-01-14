package javaprog;

class Student{
	
	String name;
	String address;
	int id;
	
	Student(String n, String a, int i){
		name= n;
		address = a;
		id= i;
	}
	void disp()
	{
		System.out.println("The name is "+name+ " address is "+address+" with id "+id);	}
}


public class Constructor {
	public static void main(String[] args) {
		Student s1= new Student("adarsh","jabalpur",25);
		s1.disp();
		Student s2= new Student("diya","jabalpur",7);
		s2.disp();
	}
	

}
 