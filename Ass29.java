package Assignments;

public class Ass29 {

	public static void main(String[] args)
	{
		int ar[]= {1,5,5,4,5};
		
		
		
			for(int i=0;i<ar.length;i++)
			{
				int j=0;
				for(int k=0;k<ar.length;k++) 
				{
					
					if(ar[i]==ar[k])
					{
						j=j+1;
						//System.out.println(j);
					}
				}
				if(j>1)
				{
						System.out.println(ar[i]);
				}
					
				
			}
			//System.out.println("no dups");
		
	}

}
