import javax.swing.JLabel;

public class ClassesAndObjects {

	public static void main(String[] args) {
		
		JLabel label = new JLabel();
		Person john = new Person();
		john.name = "John";
		john.age = 20;
		Person bob = new Person();
		bob.name = "Bob";
		bob.age = 25;
		
		System.out.println(john.name + " is "+ john.age + " years old." );
		System.out.println(bob.name + " is "+ bob.age + " years old." );
		
	}
	
}
