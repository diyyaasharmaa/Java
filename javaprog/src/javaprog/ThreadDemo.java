package javaprog;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
	public void run(int x){
		for(int i=0;i<10;i++) {
			System.out.println("child thread 2");
		}
}

	public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t =new  MyThread();
		t.run(2);
	}
}

}

