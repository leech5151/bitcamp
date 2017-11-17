package codefight;

public class String2_3 {
	static int findFirstSubstringOccurrence(String s, String x) {
		int result = -1;
		int j = s.indexOf(x.charAt(0));
		int j2 = s.lastIndexOf(x.charAt(x.length()-1));
			
			if(s.contains(x) == false) return -1;
			if(s.length() < x.length()) return -1;
			if(j + x.length() < s.length()) return -1;
			if(s.charAt(j) == x.charAt(0)) {
				if(x.equals(s.substring(j, j + x.length())) == true)
					result = j;
			}
			if(s.charAt(j2) == x.charAt(x.length()-1)) {
				if(x.equals(s.substring(j2 - x.length()+1, j2+1)) == true)
					result = j2 - x.length()+1;
			}
		return result;
	}

	public static void main(String[] args) {
		String s = "IPBsdfasdfswtkkMmTniKapBd";
		String x = "kMmTniK";
		System.out.println(findFirstSubstringOccurrence(s,x));

	}
}
