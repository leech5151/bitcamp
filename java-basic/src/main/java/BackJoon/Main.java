package BackJoon;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int sugar = scan.nextInt();
		if(sugar < 3 || sugar > 5000) return;
		int five = 0;
		int three = 0;
		int result = 0 ;

		if(sugar % 5 == 0) {
			five = sugar / 5;
			result = five;
		} else {
			while(sugar > 0) {
				if(sugar % 3 == 0) {
					three = sugar / 3;
					result = three + five;
				}
				sugar -= 5;
				five++;
			}
		}
		if(result == 0) System.out.println("-1");
		else System.out.println(result);
	}
}

