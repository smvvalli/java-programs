import java.util.*;
public class SelectionSorting
{
	public static void main(String[] args) {
	    int[] arr=new int[5];
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<arr.length-1;i++)
	    {
	        int m=i;
	        for (int j=i+1;j<arr.length;j++)
	        {
	            if (arr[j]>arr[m]) m=j;
	            {
	                int temp=arr[i];
	                arr[i]=arr[m];
	                arr[m]=temp;
	            }
	        }
	    }
	    for(int i=0;i<arr.length-1;i++)
	    {
	    System.out.println(arr[i]);
	}
}
}