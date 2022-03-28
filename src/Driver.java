
/* Give number of steps an step width
 * Draw steps using for loops
 * Step = 5 and width = 3 	***
 * 							******
 * 							*********
 * 							************
 * 							***************  */
public class Driver {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter number of steps: ");
		int steps = scan.nextInt();
		System.out.println("Enter step width: ");
		int sw = scan.nextInt();
		for (int i=1; i <= steps; i++) {
			for (int j=0; j < i*sw; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}

