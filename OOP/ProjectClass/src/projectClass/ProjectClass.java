package projectClass;

public class ProjectClass {
	
	private String name;
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	
	private String description;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	private double initialCost;
	public double getInitialCost() {
		return this.initialCost;
	}
	public void setInitialCost(double cost) {
		this.initialCost = cost;
	}
	
	public ProjectClass() {
		this.name = "None";
		this.description = "None";
		this.initialCost = 0;
	}
	
	public ProjectClass(String name) {
		this();
		this.name = name;
	}
	
	public ProjectClass(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public ProjectClass(String name, String description, double cost) {
		this.name = name;
		this.description = description;
		this.initialCost = cost;
	}
	
	public String elevatorPitch() {
		return String.format("%s(%s) : %s", name, initialCost, description);
	}
	
}
