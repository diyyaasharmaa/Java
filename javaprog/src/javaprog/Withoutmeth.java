package javaprog;

import java.util.Scanner;

public class Withoutmeth {
	public static boolean equalStr(String s2,String s1){
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i=i+1) {
			if(s1.charAt(i)!= s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		
		if(equalStr(s2,s1)) {
			System.out.println("equal");
		}
		
		else {
			System.out.println("not equal");
		}
		
		
	}
}
	
		
		 
	
