package codefight;

public class C {
	static boolean almostIncreasingSequence(int[] sequence) {
		boolean a=true,b=true;
		for(int i=1;i<sequence.length;i++)
		{
			if(sequence[i]-sequence[i-1]<=0)
			{
				int temp=sequence[i];
				int j=0;
				while(j<i-1)
				{
					if(temp<=sequence[j])
					{
						a=false;
						break;
					}
					j++;
				}
				for(j=i+1;j<sequence.length;j++)
				{
					if(sequence[i]>=sequence[j])
					{
						a=false;
						break;
					}
				}
			}
			if(sequence[i]-sequence[i-1]<=0)
			{
				int temp1=sequence[i-1];
				for(int j=0;j<i-1;j++)
				{
					if(sequence[i-1]<=sequence[j])
					{
						b=false;
						break;
					}
				}
				for(int j=i+1;j<sequence.length;j++)
				{
					if(temp1>=sequence[j])
					{
						b=false;
						break;
					}
				}
			}
		}
		if((a==false)&&(b==false))
		{
			return false;
		}
		return true;
	} 
	public static void main(String[] args) {
		int[] a = {1,2,1,2};
		System.out.println(almostIncreasingSequence(a));
	}
}
