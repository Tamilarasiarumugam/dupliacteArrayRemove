package assignments;

import java.util.Arrays;

public class DuplicateArr {
	
	public static void duplicateRemove(int[] arr,int n)
	{
		int uniqueArr[]=new int[n];
		int uniqueArrLength=0;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<uniqueArrLength;j++)
			{
				if(arr[i]==uniqueArr[j])
				{
					count++;;
//					break;
				}
				
			}
			if(count==0)
			{
				uniqueArr[uniqueArrLength]=arr[i];
				uniqueArrLength++;
			}
			
			
		}
		
		uniqueArr=Arrays.copyOf(uniqueArr, uniqueArrLength);
		
		System.out.println(Arrays.toString(uniqueArr));
		System.out.println((uniqueArrLength));
		
		
				
    }
		
		
	public static void main(String[] args)
	{
		int arr[]= {1,1,5,1,2,5,8,9,1,3};
		int n=arr.length;
		
		duplicateRemove(arr,n);
		
		
	}

}

