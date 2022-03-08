package AssistedPracticeProjects;

public class ConstructorTypes5 {

	int id;
	String name;
	ConstructorTypes5(){
		int id;
		String name;
		}
	void display() {
		System.out.println(id+" "+name);
		}
	ConstructorTypes5(int i,String n)
	{
	id=i;
	name=n;
	}
	public static void main(String[] args){
		ConstructorTypes5 a=new ConstructorTypes5(0,"null Constructor");
		ConstructorTypes5 b=new ConstructorTypes5();
		a.display();
		b.display();
		ConstructorTypes5 c=new ConstructorTypes5(1,"farook  :parameterized Constructor");
		ConstructorTypes5 d=new ConstructorTypes5(2,"idris");
		c.display();
		d.display();
	}
}