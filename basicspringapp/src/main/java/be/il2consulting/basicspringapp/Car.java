package be.il2consulting.basicspringapp;

public class Car {

	private String model;
	private int milage;
	private Engine engine;

	public void setModel(String model) {
		this.model = model;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}
	
	public void setEngine(Engine engine){
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Model " + model + "; Milage: " + milage + " km; " + engine;
	}

	public void drive() {
		System.out.println("Car driving");
	}

}
