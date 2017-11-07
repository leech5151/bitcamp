package codefight;

public class test2 {
	static boolean almostIncreasingSequence(int[] sequence) {
		int min = sequence[0];
		int max = sequence[0];
		
		for(int i = 1; i < sequence.length
				;i++) {
			if(min > sequence[i]) min = sequence[i]; 
			if(max < sequence[i]) max = sequence[i]; 
		}
		
		for(int x = min; x <= max; x++) {
			
		}
	    
	    return false;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,3,6};
		System.out.println(almostIncreasingSequence(a));

	}
}
