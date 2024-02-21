package session_06;

public class Car extends Vehical {
	private String modelname="Tata harrier";
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println("Brand- "+c.brand);
		c.honk();
		System.out.println("Model Name- "+c.modelname);
	}

}