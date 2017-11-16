package codefight;

public class String1 {
	static String amendTheSentence(String s) {
		String s1 = s.toLowerCase();
		String result = "";
		for(int i = 0; i < s.length() ; i++) {
				System.out.println(s.charAt(i) + " " +s1.charAt(i));
				if(s.charAt(i) != s1.charAt(i) && i > 0) {
					result += " ";
				}
				result += s1.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		String s = "heLlo";
		System.out.println(s.substring(0, 2));
		System.out.println(amendTheSentence(s));
	}
}
