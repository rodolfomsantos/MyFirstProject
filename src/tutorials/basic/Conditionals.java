package tutorials.basic;

public class Conditionals {

	public static void main(String[] args) {

		// if (some expression that evaluates to true)
		// and then do something

		boolean sayHello = false;
		boolean sayHey = true;

		// only the first statement to evaluate to true gets executed
		if (sayHello) {
			System.out.println("Hello");
		} else if (sayHey) {
			System.out.println("Hey");
		} else {
			System.out.println("Goodbye");
		}

		// >, <, >=, <=, != (not equal to), == (equal to) - relational operators, can use boolean variables
		// if (x = 5) assigns 5 to x
		// if (x == 5) test whether x has the value of 5 (it will either be true
		// or false)
		// && (AND) , || (OR)

		int playerX = 50;

		if (true && true) {
			System.out.println("AND executed");
		}

		// if our player has past the left side of the screen or if our player
		// is past the right side of the screen
		if (playerX < 0 || playerX > 800)
			// some code that reverses our player's direction
			System.out.println("OR executed");

	}

}
