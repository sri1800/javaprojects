package sorting;

public class bubblesort {

	public static void main(String[] args) 
	{
		int[]a= {36,18,26,12,5,54};
		int n=a.length;
		int temp;
		for(int i=0;i<n;i++)
		{
			int flag=0;
			for(int j=0;j<n-1-i;j++)
			{
				//if(a[j].compareTo(a[j+1])<0)
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for(int i=0;i<n;i++) 
		{
			System.out.print(a[i]+" ");	
		}
	

	}

}
