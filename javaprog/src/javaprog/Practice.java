package javaprog;

class Call{
	static double add(int a, double b) {
		return a+b;
	}
	static double add(double b, int a) {
		return a+b;
	}
}



public class Practice {
	public static void main(String[] args) {
		System.out.println(Call.add(3,4.0));
		
		System.out.println(Call.add(3.9,4));
		
	}
	
	
	
}
	
