package pattern;

public class p7 {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
				if(j==n)
				{
					for(int k=1;k<=i;k++)
					{
						System.out.print("*");
					}
				}
			}
			System.out.println("");
		}
	}

}
