// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int rnd = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * rnd);
		int b = (int)(Math.random() * rnd);
		int c = (int)(Math.random() * rnd);
		int first, second , third;
		first = Math.min(a , Math.min(b,c));
		int checkMiddle1 = Math.max(a, b);
		int checkMiddle2 = Math.max(b, c);
		int checkMiddle3 = Math.max(a, c);
		second = Math.min(checkMiddle1, Math.min(checkMiddle2, checkMiddle3) );
		third = Math.max(a,Math.max(b, c));
		System.out.println("The numbers " + a + ", " + b + ", and " + c + " in ascending order are: " + first + ", " + second + ", " + third );
		



	}
}
