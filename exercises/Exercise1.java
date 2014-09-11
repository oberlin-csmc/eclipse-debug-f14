package exercises;

/**
 * Debugging Exercise 1
 * @author dbarella@oberlin.edu (Dan Barella)
 * 
 * First steps with the debugger -- find the off-by-one error! You can do this 
 * pretty easily by reading the code, but try stepping through with the
 * debugger and really finding the error.
 */
public class Exercise1 {

    public static void offByOne(String[] array) {
	for(int i=0; i<=array.length; i++) {
	    System.out.println(array[i]);
	}
    }
    
    public static void main(String[] args) {
	String[] array = {"Cat", "Bat", "Mat"}; // Make a quick array
	offByOne(array);
    }

}
