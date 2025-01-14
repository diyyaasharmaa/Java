package javaprog;

 
public class WhileL {
	public static void main(String[] args) {
		
		String s1= "Programmer";
		String s2= "gram";
		int count=0;
		
		if(s1.length()>=s2.length()) {
			int i=0;
			int j=0;
			
			while(j<s2.length() || i<s1.length()) {
				if(s1.charAt(i)!= s2.charAt(j)) {
					i++;
				}
				
				else if(s1.charAt(i) ==s2.charAt(j)) {
					i++;
					j++;
					count++;
				}
			}
		}
		else
			System.out.println("does not exist in the string");
	}

}
