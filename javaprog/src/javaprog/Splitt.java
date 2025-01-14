package javaprog;
import java.util.*;
public class Splitt {
	public static void main(String[] args) {
		String str="Apple is red";
		String[] str2= str.split(" ");
		for(String s:str2) {
			System.out.println(s);
		}
	}

}
