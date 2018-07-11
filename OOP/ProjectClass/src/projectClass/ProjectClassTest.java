package projectClass;

public class ProjectClassTest {
	
	public static void main(String[] args) {
		
//		ProjectClass nothing = new ProjectClass();
//		System.out.println(nothing.elevatorPitch());
//		ProjectClass aName = new ProjectClass("HasName");
//		System.out.println(aName.elevatorPitch());
//		ProjectClass everything = new ProjectClass("HasName", "HasDesc");
//		System.out.println(everything.elevatorPitch());
//		ProjectClass andMore = new ProjectClass("HasName", "HasDesc", 1000);
//		System.out.println(andMore.elevatorPitch());
		
		Portfolio p = new Portfolio();
		p.AddProject("Project1");
		p.AddProject("Project2","Description2");
		p.AddProject("Project3","Description3",100);
		p.display();
		
	}
	
}
