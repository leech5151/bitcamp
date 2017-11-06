package java100.app.Me;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
	static Scanner keyScan = new Scanner(System.in);

	static boolean confirm(String message) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("y") || response.equals("yes"))
			return true;
		return false;
	}
	 

	public static void main(String[] args) {
		
		ArrayList<Score> list = new ArrayList<>();
		
		

		while(true){
			System.out.print("성적관리> ");
			String input = keyScan.nextLine();
			while(true) {
				if(input.equals("add")) {
					Score score = new Score();
					score.input();
					list.add(score);
					if(!confirm("계속 하시겠습니까?")) break;
				}

				if(input.equals("list")) {
					for (int i = 0; i < list.size(); i++) {
			            System.out.printf("%s \n", list.get(i));
			        }
					break;
				}

				if(input.equals("view")) {
					System.out.print("이름? ");
			        String view = keyScan.nextLine();
			        for (int i = 0; i < list.size(); i++) {
			        	if(view.equals(list.get(i).name))
			            System.out.printf("%s \n", list.get(i));
			        }
			        break;
				}
				
				if(input.equals("delete")) {
					System.out.print("이름? ");
					String delete = keyScan.nextLine();
					  for (int i = 0; i < list.size(); i++) {
				        	if(delete.equals(list.get(i).name))
				            list.remove(i);
				        }
				        break;
				}
				
				if(input.equals("update")) {
					System.out.print("이름? ");
					String update = keyScan.nextLine();
					  for (int i = 0; i < list.size(); i++) {
				        	if(update.equals(list.get(i).name)) {
				        		System.out.printf("국어? (%d)",list.get(i).subjects[0]);
				        		int kor = keyScan.nextInt();
				        		System.out.printf("영어? (%d)",list.get(i).subjects[1]);
				        		int eng = keyScan.nextInt();
				        		System.out.printf("수학? (%d)",list.get(i).subjects[2]);
				        		int math = keyScan.nextInt();
				        		
				        		if(!confirm("계속 하시겠습니까?")) {
				        			list.get(i).subjects[0] = kor;
				        			list.get(i).subjects[1] = eng;
				        			list.get(i).subjects[2] = math;
				        		}
				        		else {
				        			break;
				        		}
				        	}
				        }
				        break;
				}

			}
		}



	}
}




