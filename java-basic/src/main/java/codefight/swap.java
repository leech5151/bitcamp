package codefight;

public class swap {
	static String reverseParentheses(String s) {
		String[] arr = new String[s.length()];
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			arr[i] = s.substring(i,i+1);
		}
		while(true) {
			int start = -1;
			int end = -1;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].equals("(")) start = i + 1;	
			}
			for(int i = arr.length-1; i > start; i--) {
				if(arr[i].equals(")")) end = i - 1;
			}
			if(start == -1 || end == -1) break;
			arr[start-1] = "0";
			arr[end+1] = "0";
			for(int i = 0; i <= (end - start) / 2; i++) {
				String temp = arr[start + i];
				arr[start + i] = arr[end - i];
				arr[end - i] = temp;
			}
		}

		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("0")) continue;
			result += arr[i];
		}
		return result;
	}




	public static void main(String[] args) {
		String s = "The ((quick (brown) (fox) jumps over the lazy) dog)";

		System.out.println(s);
		System.out.println(reverseParentheses(s));

	}
}




