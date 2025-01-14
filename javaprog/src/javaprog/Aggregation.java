package javaprog;

class Battery{
	String type;
	Battery(String type){
		this.type=type;
	}
	public String getname()
	{
		return type;
	}
	
}
class Mobile{
	String brand;
	Battery battery;
	
	Mobile(String brand)
	{this.brand=brand;
}
	public void setname(Battery battery) {
		this.battery=battery;
	}
	void disp()
	{
	if(battery != null)
		System.out.println("The brand of moblie is "+brand+" battery type is");
	else
		System.out.println("The brand of moblie is "+brand+" battery type is");
	
	}
public class Aggregation {
	Battery b = new Battery("lithium ion");
	Mobile m = new Mobile("iPhone");
	
	
	
	}
}


