package tutorials.basic;

public class Arrays {

	public static void main(String[] args) {
		
		int x; // creating that one box in memory that store one int value

		int [] myArray; // declaring an Array that will store int's

		//myArray = new int [5000]; // initializing our array to be capable of holding 5000 int's.
		myArray = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		Person [] people;
		myArray.
		
		/*x = 5;
		
		myArray[0] = x;
		myArray[1] = 3;
		myArray[2] = 0;
		myArray[3] = 1;
		myArray[4] = 0;*/
		
		/*// iterating over an array
		for (int i = 0; i < myArray.length; i++) {
			
			System.out.println(myArray[i]);
		}*/
		
		/*for (int counter = 0; counter < myArray.length; counter++) {
			myArray[counter] = counter;
		}*/
		
		for (int number : myArray) {
			System.out.println(number);
		}
	}
	
}
