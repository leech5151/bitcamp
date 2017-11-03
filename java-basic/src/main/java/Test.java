
public class Test {
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
				System.out.printf("1 num : %d, i : %d, life : %d\n",num,i,life);
				if(life >= 2) return false;
				if(num < sequence[i+1]) {
					num = sequence[i+1];
					for(int j = i+2; j < len-1; j++) {
						if(num >= sequence[j]) {
							life++;
							System.out.printf("2 num : %d, i : %d, life : %d\n",num,i,life);
							if(life >= 2) return false;
						}
					}
				}
			}
			num = sequence[i];
			for(int j = i+2; j < len-1; j++) {
				if(num >= sequence[j]) {
					life++;
					System.out.printf("3 num : %d, i : %d, life : %d\n",num,i,life);
					if(life >= 2) return false;
				}
			}
		}

		return true;
	}


	public static void main(String[] args) {
		int[] arr = {1,2,1,2};

		System.out.println(almostIncreasingSequence(arr));

	}
}
