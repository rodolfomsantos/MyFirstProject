
public class Loops {
	public static void main(String[] args) {

		//whileLoop();
		//doWhileLoop();
		forLoop();

	}

	static void whileLoop (){

		int counter = 10;

		while (counter < 10) {

			counter = counter + 1;
			System.out.println(counter);
		}

	}
	
	static void doWhileLoop() {
		
		int counter = 10;
		do {
			
			counter = counter + 1;
			System.out.println(counter);
			
			} while (counter < 10); {
			
		}
		
	}
	
	static void forLoop() {
		// for (initialize counter; condition to see if we should run the loop; change counter variable)
		
		for (int counter = 0; counter <= 10; counter = counter + 1){
			System.out.println(counter);
		}
		
		// teste
		
	}
	static void teste (){
		
	}

}
