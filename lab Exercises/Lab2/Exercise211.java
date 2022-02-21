import java.util.*;
public class Exercise211 {
	public static int getSecondSmallest(int[] a){
	int temp;
	for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int res = getSecondSmallest(a);

		System.out.println("Second Smallest number: "+res);
	}
}