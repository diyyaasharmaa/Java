package javaprog;

public class Array {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
//		int max=arr[0];
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i]>max){
//				max=arr[i];
//			}
//		}	
//		System.out.println(max);
		
//		for(int i=0;i<=arr.length;i++) {
//			System.out.println(i);
//		}
		
//		int min=arr[0];
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i]<min){
//				min=arr[i];
//			}
//		}	
//		System.out.println(min);
		
		int s=0;
		for(int i=0;i<arr.length;i++) {
			s=s+arr[i];
		}
		System.out.println(s);
		
	}
	
}
