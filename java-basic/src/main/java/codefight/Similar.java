package codefight;

public class Similar {
	static boolean areSimilar(int[] a, int[] b) {
		int aTemp, bTemp;
		int Index = -1;
		int count = 0;
		int pair = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
			    if(i == Index) continue;
			    pair++;
			    count++;
			    aTemp = a[i];
			    bTemp = b[i];
			    for(int j = i+1; j < a.length; j++) {
			        if(a[j] == bTemp && b[j] == aTemp) {
			            Index = j;
			            pair--;
			        }
			    }
			}
			if(count == 2 || pair == 1) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {2, 1, 3};
	}
}
