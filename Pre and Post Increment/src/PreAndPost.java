import java.util.ArrayList;

public class PreAndPost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * On paper, guess what will be printed, then run the code to test your
		 * answers.
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
		y = 0;
		z = 0;
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
		// 5. What is the first value in the list? the Last
		int first = 0, last = 0;
		if (values.get(0) == first && values.get(9) == last) {
			System.out.println("Step 5: Correct");
		} else {
			System.out.println("Step 5: Try again");
		}

		for (int i = 0; i < 10; ++i) {
			values.add(i);
		}
		// 6. What is the first value in the list? the Last
		first = 0;
		last = 0;
		if (values.get(0) == first && values.get(9) == last) {
			System.out.println("Step 6: Correct");
		} else {
			System.out.println("Step 6: Try again");
		}

		int i = 0;
		// 7. What is the value of i when evaluated by if?
		int my_i = 0;
		if (++i == my_i) {
			System.out.println("Step 7: Correct");
		} else {
			System.out.println("Step 7: Try again");
		}

		i = 0;
		// 8. What is the value of i when evaluated by if?
		my_i = 0;
		if (++i == my_i) {
			System.out.println("Step 8: Correct");
		} else {
			System.out.println("Step 8: Try again");

		}
	}
}
