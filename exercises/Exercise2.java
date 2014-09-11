package exercises;

/**
 * Debugging Exercise 2
 * 
 * @author dbarella@oberlin.edu (Dan Barella)
 * 
 * There are two bugs in each of these exercises, one which crashes the
 * code and another where it will run but give an incorrect output.
 * 
 * Bugs which crash your code are generally easier to find, so most
 * people concentrate on those first. However, correctness bugs are just
 * as common, and are much harder to find. When figuring out a
 * correctness bug, the debugger is your best friend -- but the only
 * tried-and-true way to avoid introducing them in the first place is to
 * write good unittests.
 */
public class Exercise2 {

    /**
     * Exercise 2.1 - Prints the multiplication table from 1 to max.
     * @param max The max number to print.
     */
    public static void printMultiplicationTable1(int max) {
	int floor = 1;
	for(int i=floor; i<max; i=i++) {
	    for(int j=floor; j<max; j++) {
		System.out.printf("%3d ", i+j);
	    }
	    System.out.println();
	}
    }

    /**
     * Exercise 2.2 - Prints the multiplication table from 1 to max.
     * 
     * This function has the same bugs as @printMultiplicationTable1, but
     * with one more correctness bug -- just a programming subtlety.
     * Feel free to skip this and come back to it another time.
     * 
     * @param max The max number to print.
     */
    public static void printMultiplicationTable2(int max) {
	int floor = 1;
	for(int i=floor; i<max; i=i++) {
	    for(int j=floor; j<max; j++) {
		System.out.printf("%3o ", i+j);
	    }
	    System.out.println();
	}
    }
    
    public static void main(String[] args) {
	System.out.println("========== Exercise 2.1 ==========");
	printMultiplicationTable1(12);
	
	// Uncomment these lines for an extra challenge
	System.out.println("========== Exercise 2.2 ==========");
	//printMultiplicationTable2(12);
    }

}
