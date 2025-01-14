package javaprog;

class Mythread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class ThreadPriority {
	public static void main(String[] args)throws InterruptedException {
		Mythread t = new Mythread();
		t.start();
		t.join();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}

}
