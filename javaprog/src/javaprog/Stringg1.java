package javaprog;

public class Stringg1 {
	public static void main(String[] args) {
		String str1= "javaa";
		String str2= new String("javaaa");
		String str3= new String("Java");
		String str4= "JavA";
		
		
		System.out.println(str1.indexOf('j'));
		System.out.println(str2.lastIndexOf('a'));
		System.out.println(str3.lastIndexOf('J'));
		System.out.println(str4.lastIndexOf('v'));
		 
	}

}
