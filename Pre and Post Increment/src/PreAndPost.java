import java.util.ArrayList;

/*
 * PreAndPost is an interactive worksheet to explore the pre and post increment operators in Java. Students
 * will be challenged to run the code manually and predict the correct operation. The teacher may need to be 
 * familiar with for loops to explain the outcome.
 * 
 * Copyright 2016 The League of Amazing Programmers.
 */

public class PreAndPost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Complete all the steps by setting the value of the 'my_' variables.
		 * 
		 * Pre-increment is ++x
		 * Pre-decrement is --x
		 * Post-increment is x++
		 * Post-decrement is x--
		 * 
		 * Pre-increment operations can be rewritten using the following:
		 * 
		 * a = ++x + b => x = x + 1;
		 *                a = x + b;
		 *                
		 * Post-increment operations can be rewritten using the following:
		 * 
		 * a = x++ + b => a = x + b;
		 *                x = x + 1;
		 *                
		 * What are the rewrite rules for decrement operations?
		 * 
		 */

		int x = 0, y = 0, z = 0;
		x++;
		y--;
		z += y;

		// 1. Predict the values of x, y and z
		int my_x = 0, my_y = 0, my_z = 0;
		if (x == my_x && y == my_y && z == my_z) {
			System.out.println("Step 1: Correct");
		} else {
			System.out.println("Step 1: Try again");
		}

		x = 0;
		y = 0;
		z = 0;
		y = x++;
		z = ++x;
		// 2. Predict the values of x, y, and z
		my_x = 0;
		my_y = 0;
		my_z = 0;
		if (x == my_x && y == my_y && z == my_z) {
			System.out.println("Step 2: Correct");
		} else {
			System.out.println("Step 2: Try again");
		}

		x = 0;
		y = 0;
		z = 0;
		y = --x;
		z = ++x;
		// 3. Predict the values of x, y, and z
		my_x = 0;
		my_y = 0;
		my_z = 0;
		if (x == my_x && y == my_y && z == my_z) {
			System.out.println("Step 3: Correct");
		} else {
			System.out.println("Step 3: Try again");
		}

		x = 0;
		y = 1;
		z = 1;
		y *= --x;
		z *= -x;
		// 4. Predict the values of x, y, and z
		my_x = 0;
		my_y = 0;
		my_z = 0;
		if (x == my_x && y == my_y && z == my_z) {
			System.out.println("Step 4: Correct");
		} else {
			System.out.println("Step 4: Try again");
		}

		ArrayList<Integer> values = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			values.add(i);
		}
		// 5. What is the first value in the list? What is the length of the list?
		int my_first = 0, my_size = 0;
		if (values.get(0) == my_first && values.size() == my_size) {
			System.out.println("Step 5: Correct");
		} else {
			System.out.println("Step 5: Try again");
		}

		values.clear();
		for (int i = 0; i < 10; ++i) {
			values.add(i);
		}
		// 6. What is the first value in the list? the Last
		my_first = 0;
		my_size= 0;
		if (values.get(0) == my_first && values.size() == my_size) {
			System.out.println("Step 6: Correct");
		} else {
			System.out.println("Step 6: Try again");
		}

		int i = 1;
		// 7. What is the value of i when evaluated by if?
		int my_i = 0;
		if (i++ == my_i) {
			System.out.println("Step 7: Correct");
		} else {
			System.out.println("Step 7: Try again");
		}

		i = 1;
		// 8. What is the value of i when evaluated by if?
		my_i = 0;
		if (++i == my_i) {
			System.out.println("Step 8: Correct");
		} else {
			System.out.println("Step 8: Try again");

		}
		
		@SuppressWarnings("unused")
		Integer my_integer = 1;
		@SuppressWarnings("unused")
		float my_float = 1.4f;
		@SuppressWarnings("unused")
		Number my_number = 1;
		
		// 9. Uncomment the statements that will compile
//		 my_integer++;
//		 my_float++;
//		 my_number++;
		
		// Bonus: what are the values of these variables (if they work)?
	}
}
