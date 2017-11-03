
package java100.app.Me3;
import java.util.Arrays;
import java.util.Scanner;

public class Score {  
	static Scanner keyScan = new Scanner(System.in);
    protected String name;
    protected int[] subjects; 
    protected int sum;
    protected float aver;

    @Override
	public String toString() {	
		return  name + ", " + Arrays.toString(subjects) + ", " + sum + ", " + aver;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(aver);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(subjects);
		result = prime * result + sum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (Float.floatToIntBits(aver) != Float.floatToIntBits(other.aver))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(subjects, other.subjects))
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}

	public Score() {
        this.subjects = new int[3];
    }
    
    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[]{kor, eng, math};
        
        this.compute();
    }
    
    private void compute() {
    	int sum = 0;
        for (int sub : this.subjects) {
            sum += sub;
        } 
        this.sum = sum;
        this.aver = (float)this.sum / this.subjects.length;
    }
    
    public void print() {
        System.out.printf("%-4s, %4d, %6.1f\n",  
                this.name, 
                this.sum, 
                this.aver);
    }
    
    public void input() {
    	keyScan = new Scanner(System.in);
        
        System.out.print("?ù¥Î¶?? ");
        this.name = keyScan.nextLine();
        
        System.out.print("Íµ??ñ¥? ");
        this.subjects[0] = keyScan.nextInt();
        
        System.out.print("?òÅ?ñ¥? ");
        this.subjects[1] = keyScan.nextInt();
        
        System.out.print("?àò?ïô? ");
        this.subjects[2] = keyScan.nextInt();
        
        this.compute();
    }
    
    public void printDetail() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0],
                this.subjects[1],
                this.subjects[2],
                this.sum, 
                this.aver);
    }
    
    public void update() {
    	keyScan = new Scanner(System.in);
        
        System.out.printf("Íµ??ñ¥? (%d) ",subjects[0]);
        int kor = this.subjects[0];
        try {
        	kor = Integer.parseInt(keyScan.nextLine());
        }catch(Exception e) {}
        
        System.out.printf("?òÅ?ñ¥? (%d) ",subjects[1]);
        int eng = this.subjects[0];
        try {
        	eng = Integer.parseInt(keyScan.nextLine());
        }catch(Exception e) {}
        
        System.out.printf("?àò?ïô? (%d) ",subjects[2]);
        int math = this.subjects[0];
        try {
        	math = Integer.parseInt(keyScan.nextLine());
        }catch(Exception e) {}
        
        if(confirm2("Î≥?Í≤ΩÌïò?ãúÍ≤†Ïäµ?ãàÍπ??(y/N) ")) {
        	this.subjects[0] = kor;
        	this.subjects[1] = eng;
        	this.subjects[2] = math;
        	this.compute();
        	System.out.println("Î≥?Í≤ΩÌïò???äµ?ãà?ã§.");
        }else {
        	System.out.println("Î≥?Í≤ΩÏùÑ Ï∑®ÏÜå?ïò???äµ?ãà?ã§.");
        }
    }
    
    static boolean confirm2(String message) {
    	keyScan = new Scanner(System.in);
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("n") || response.equals("no") || response.equals("")) {
			return false;
		}
		return true;
	}
}
