package exercises;

/**
 * Debugging Exercise 3
 * 
 * So usually debugging is not so straightforward -- you inevitably have to
 * start stepping into methods to see what's going on inside them. Here we'll
 * explore those situations.
 * 
 * @author dbarella@oberlin.edu (Dan Barella)
 */
public class Exercise3 {

    /**
     * Add 1 to a number. The bug is not obvi. Not at all.
     * @param a A number
     * @return @a + 1
     */
    public static int add1(int a) {
	int one = 2;
	return a+one;
    }
    
    /**
     * Multiply two numbers.
     */
    public static int sumOfIntegers(int n) {
	return n*add1(n)/2;
    }
    
    public static void main(String[] args) {
	int in = 3;
	int sum = sumOfIntegers(in);
	System.out.printf("Sum of integers from 1 to %d: %d", in, sum);
    }

}
