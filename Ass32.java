package Assignments;

public class Ass32 {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int ar1[]= {1,2,3,4,5};
		
		if(ar.length==ar1.length)
		{
			for(int i=0;i<ar.length;i++)
			{
				for(int k=0;k<ar.length;k++) 
				{
					int j=0;
					if(ar[i]==ar1[k])
					{
						j++;
					}
					if(j>1)
					{
						System.out.println("not equal");
					}
				}
			}
			System.out.println("are equal");
		}
		else
		{
			System.out.println("not equal");
		}


}
}