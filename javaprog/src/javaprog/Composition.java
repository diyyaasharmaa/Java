package javaprog;

class Engine{
	String type;
	Engine(String type)
	{
		this.type=type;
	}
	void start()
	{
		System.out.println(type+ "engine starts");
	}
}
class Car{
	String brand;
	private final Engine engine;
	Car(String brand,String engineType)
	{
		this.brand=brand;
		this.engine = new Engine(engineType);
		
	}
	void carStarts() {
		System.out.println(brand+" car is starting");
		engine.start();
	}
	
}
public class Composition {
	public void main(String[] args) {
		Car c= new Car("verna","diesel");
		c.carStarts();
	}

}
