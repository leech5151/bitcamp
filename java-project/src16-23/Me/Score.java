//: ## 罹≪뒓�솕 �쟻�슜
//: - 紐⑤뱺 �븘�뱶�뿉 ���빐 �쇅遺� �젒洹쇱쓣 李⑤떒�븳�떎.
//:   �떒 �옄�떇 �겢�옒�뒪�뿉�꽌�뒗 吏곸젒 �젒洹쇳븷 �닔 �엳寃� �뿀�씫�븳�떎.
//: 
package java100.app.Me;
import java.util.Arrays;
import java.util.Scanner;

public class Score {  
    
    public String name;
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
        for (int sub : this.subjects) {
            this.sum += sub;
        } 
        this.aver = (float)this.sum / this.subjects.length;
    }
    
    public void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
    }
    
    public void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        
        System.out.print("국어? ");
        this.subjects[0] = keyScan.nextInt();
        
        System.out.print("영어? ");
        this.subjects[1] = keyScan.nextInt();
        
        System.out.print("수학? ");
        this.subjects[2] = keyScan.nextInt();
        
        this.compute();
    }
    
   
}
