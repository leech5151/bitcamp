package codefight;

public class String2 {
	static int findFirstSubstringOccurrence(String s, String x) {
		long start = System.currentTimeMillis();
		System.out.println(start);
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < x.length(); j++) {
				
				System.out.printf("s : %s, x : %s\n",s.charAt(i),x.charAt(j));
				
				if(s.charAt(i) != x.charAt(j)) {
					i -= j;
					break;
				}
				else i++;
				if(j == x.length()-1) {
					return i-x.length();
					
				}
				if(i >= s.length()) return -1;
				
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		String s = "ATErUUeUkVFVNfxfUKtntOErKmZLUpWpHRASdxjUhzzxygmnNnKabPPgPqyvCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKapBlrd";
		String x = "vCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKa";
		System.out.println(findFirstSubstringOccurrence(s,x));
		long end = System.currentTimeMillis();
		System.out.println(end);
	}
}
