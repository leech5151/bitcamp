package codefight;

public class String2_1 {
	static int findFirstSubstringOccurrence(String s, String x) {
		int j = 0;
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == x.charAt(j)) {
				System.out.printf("s : %s, x : %s\n",s.charAt(i),x.charAt(j));
				count = j+1;
				j++;
			}
			
			
			if(s.charAt(i) != x.charAt(j) && count != x.length()) {
				j = 0;
			}
			if(count == x.length()) return i-j+1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		String s = "ATErUUeUkVFVNfxfUKtntOErKmZLUpWpHRASdxjUhzzxygmnNnKabPPgPqyvCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKapBlrd";
		String x = "vCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKa";
		System.out.println(findFirstSubstringOccurrence(s,x));
	}
}
