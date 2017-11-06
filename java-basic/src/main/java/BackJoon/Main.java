package BackJoon;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); 
		int y = scan.nextInt();
		int result = 0;

		for(int i = 1; i <= x; i++) {
			if(x == i) {
				for(int j = 1; j <= y; j++) {
					result ++;
				}
			}else {
				for(int j = 1; j <= 31; j++) {
					result ++;
					if(i == 4 || i == 6 || i == 9 || i == 11) {
						if(j == 30) break;
					}
					if(i == 2) {
						if(j == 28) break;
					}
				}
			}

		}

		switch(result % 7) {
		case 0:System.out.println("SUN");break;
		case 1:System.out.println("MON");break;
		case 2:System.out.println("TUE");break;
		case 3:System.out.println("WEN");break;
		case 4:System.out.println("THU");break;
		case 5:System.out.println("FRI");break;
		case 6:System.out.println("SAT");break;
		}
	}

}