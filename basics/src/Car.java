
public class Car {

	private String model;
	private int milage;
	
	public void drive(){
		System.out.println(model + " is driving. The milage is " + milage);
	}
	
	//getters and setters
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	
}
