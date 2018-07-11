package projectClass;

import java.util.ArrayList;

public class Portfolio {

	private ArrayList<ProjectClass> a = new ArrayList<ProjectClass>();
	public void AddProject(String name, String description, long cost) {
		a.add(new ProjectClass(name, description, cost));
	}
	public void AddProject(String name, String description) {
		a.add(new ProjectClass(name, description));
	}
	public void AddProject(String name) {
		a.add(new ProjectClass(name));
	}
	public ArrayList<ProjectClass> getProjects() {
		return a;
	}
	
	public long getPortfolioCost() {
		long cost = 0;
		for (ProjectClass p : a) {
			cost += p.getInitialCost();
		}
		return cost;
	}
		
	public void display() {
		for (ProjectClass p : a ) {
			System.out.println(p.elevatorPitch());
		}
		System.out.println(getPortfolioCost());
	}
	
}
