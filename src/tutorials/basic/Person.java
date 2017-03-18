package tutorials.basic;

public class Person {


	String name; // instance variable
	int age; // if we make "satic int age;" this will fix the age to the last integer of the class whe its called.(é como a funçâo $ no excel, ou seja fixa o valor mas aqui ao ultimo valor introduzido quando se chama esta classe)
	
	public Person (String name) {
		this.name = name;
		System.out.println("Person Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayHelloTo(Person person) {
		
		System.out.println(getName() + " said hello to " + person.getName());
		
	}
	
}
