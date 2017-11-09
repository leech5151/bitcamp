package codefight;

public class test2 {
	static boolean almostIncreasingSequence(int[] sequence) {
		int min = sequence[0];
		int minJ = 0;
		int max = sequence[0];
		int life = 0;
		for(int i = 1; i < sequence.length; i++) {
			if(min > sequence[i]) min = sequence[i]; 
			if(min == sequence[i]) {
				life++; 
				if(life >= 2) return false;
			}
			if(max < sequence[i]) max = sequence[i]; 
		}
		System.out.printf("초기값 => min : %d, max : %d life : %d\n", min, max,life);
		
		for(int x = 0; x < sequence.length; x++) {
			
			for(int y = min; y <= max; y++) {
				if(y == sequence[x]) {
					if(x > 0) minJ = min;
					min = sequence[x];
					break;
				}
				
				else if(y > sequence[x]) {
					life++; 
					if(life >= 2) return false;
					if(min - minJ < sequence[x] - minJ) {
						x++;
						break;
						
					}else if(minJ == sequence[x]) {
						life++; 
						if(life >= 2) return false;
					}  
					else {
						
						min = sequence[x];
						break;
					}
				}
			}
			
			System.out.printf("초기값 => min : %d, sequence[x] : %d life : %d\n", min, sequence[x],life);
		}
	    
	    return true;
	}
	public static void main(String[] args) {
		int[] a = {1,4,10,4,2};
		System.out.println(almostIncreasingSequence(a));

	}
}
