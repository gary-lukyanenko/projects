package be.il2consulting.basicspringapp;

public class Engine {

	private String model;
	private String type;
	
	public void logOnCreate(){
		System.out.println("New engine created");
	}
	
	public void logOnDestroy(){
		System.out.println("Engine cleaned-up");
	}
	
	// Getters, setters and toString()
	
	public void setModel(String model){
		this.model = model;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String toString(){
		return "Engine model: " + model + "; Engine type: " + type;
	}
}
