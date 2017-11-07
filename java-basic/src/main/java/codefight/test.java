package codefight;

public class test {
	static boolean almostIncreasingSequence(int[] sequence) {
	    int life = 0;
	    int num;
	    int len = sequence.length;
	    
	    if(sequence[0] < sequence[1]) num = sequence[0];
	    else {
	        num = sequence[1];
	        life++;
	    }
	    for(int i = 1; i < len-1; i++) {
	        if (sequence[i] >= sequence[i+1] ) {
	            life++;
	            if(life >= 2) return false;
	            if(num < sequence[i+1]) {
	                num = sequence[i+1];
	                for(int j = i+2; j < len-1; j++) {
	                    if(num >= sequence[j]) {
	                        life++;
	                        if(life >= 2) return false;
	                    }
	                }
	            }else if(num == sequence[i+1]) {
	            	life++;
	            	if(life >= 2) return false;
	            }
	            else {
	                num = sequence[i];
	                for(int x = i+2; x < len-1; x++) {
	                    if(num >= sequence[x]) {
	                        life++;
	                        if(life >= 2) return false;
	                    }
	                }
	            }
	        }else num = sequence[i];
	    }
	    return true;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,3,6};
		System.out.println(almostIncreasingSequence(a));

	}
}
