package javaprog;

import java.util.Scanner;
public class ExtractChar {
	public static String pal(String str,String s1){
		for(int i=str.length()-1;i>=0;i=i-1) {
			System.out.println(s1=s1+str.charAt(i));
		}
		return s1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= "";
		String str= sc.nextLine();
		String s3 = pal(str,s1); 
		
		System.out.println(s1);
		
		if(s3.equals(str))
		{
			System.out.println("True");
			}
		
		else 
		{
			System.out.println("False");
		}
			
	}

}
