package javaprog;

import java.util.Scanner;
public class Stars {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i=1;i<=n;i=i+1) {
		for(int k=1;k<=i;k=k+1) {
			System.out.print(" ");
		}
			for(int j=1;j<=(2*n)-(2*i-1);j=j+1) {
				System.out.print("*");
			}
			System.out.println();
	}
	
	}	
}

