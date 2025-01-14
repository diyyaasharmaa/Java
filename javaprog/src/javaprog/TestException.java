package javaprog;

class TooYoungException extends RuntimeException{
	TooYoungException(String s){
		super(s);
	}
	
}

public class TestException {
	public static void main(String[] args) {
		int age=15;
		if(age<18) {
			throw new TooYoungException("you are teen");
		}
		else {
			System.out.println("eligibe to vote");
		}
	}

}
