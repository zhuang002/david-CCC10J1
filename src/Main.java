import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int left=0;
		int right=0;
		
		if (n>5) {
			left = 5;
			right = n-5;
		} else {
			left=n;
			right=0;
		}
		
		int count = 0;
		
		while (left>=right) {
			count++;
			left--;
			right++;
		}
		
		System.out.println(count);

	}

}
