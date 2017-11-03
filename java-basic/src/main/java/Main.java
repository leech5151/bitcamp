import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int suger = Integer.parseInt(scan.nextLine());
		if(suger < 3 || suger > 5000) return;
		int five = 0;
		int three = 0;
		int fiveR = suger % 5;
		int threeR = suger % 3;
		int tenR = suger % 10;;
		
		int result;

		if(fiveR == 0 || fiveR == 3 || threeR == 0 || tenR % 3 == 0) {
			while(suger > 0) {
				if(suger > 15) {
					suger -= 5;
					five++;
				} else {
					if(suger >= 5) {
						if((suger - 5) % 3 == 0 || (suger % 5 == 0)) {
							suger -= 5;
							five++;
						}else {
							suger -= 3;
							three++;
						}
					}else {
						suger -= 3;
						three++;
					}
				}
			}
			result = five + three;
			System.out.println(result);
			return;
		}
		else {
			System.out.println("-1");
			return;
		}
	}
}

