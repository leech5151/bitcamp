package codefight;

public class String2_3 {
	static int findFirstSubstringOccurrence(String s, String x) {
		int result = -1;
		int j = s.indexOf(x.charAt(0));
			
			if(s.length() == x.length()) {
				if(x.equals(s) == false) return -1;
			}
			if(s.length() < x.length()) return -1;
			if(j + x.length() > s.length()) return -1;
			if(s.charAt(j) == x.charAt(0)) {
				if(x.equals(s.substring(j, j + x.length())) == true)
					return j;
			}
		return result;
	}

	public static void main(String[] args) {
		String s = "ATErUUeUkVFVNfxfUKtntOErKmZLUpWpHRASdxjUhzzxygmnNnKabPPgPqyvvCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKapBlrd";
		String x = "vCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKa";
		System.out.println(findFirstSubstringOccurrence(s,x));

	}
}
