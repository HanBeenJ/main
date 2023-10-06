package prac;

public class Circle {
	private final double PI = 3.14;
	
	private int radius;
	private String name;
	
	public Circle(Circle c) {
		this.radius = c.radius;
		this.name = new String(c.name);
		
		
	}
	
	public Circle(int r, String n) {
		this.initialize(r,n);
	}
	private void initialize(int r, String n) {
		this.radius = r;
		this.name = n;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public double getPI() {
		
		return this.PI;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	public String toString() {
		return "name : " + getName() + " radius : " + getRadius();
	}
	public static void main(String[] args) {
		System.out.println("Class and object Practice");
		
		/*Circle pizza = new Circle();
		
		pizza.radius =10;
		pizza.name="Cheese Pizza";
		
		System.out.println(pizza.toString());
		
		Circle pizza2 = new Circle();
		
		pizza2.initialize(8,  "Chicago Pizza");
		
		System.out.println(pizza2.toString());*/
		
		Circle pizza = new Circle(15, "Hwaiian Pizza");
		
		System.out.println(pizza.toString());
		
		Circle pizzaCopy = new Circle(pizza);
		System.out.println(pizzaCopy.toString());
		
		// TODO Auto-generated method stub

	}

}
