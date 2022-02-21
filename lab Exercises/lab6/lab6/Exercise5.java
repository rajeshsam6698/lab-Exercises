package lab6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Exercise5
{
	public static int getSmallest(int[] a)
	{
		ArrayList<Integer> nums=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			nums.add(a[i]);
		}
		Collections.sort(nums);
		return nums.get(1);	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(getSmallest(a));
	}
}
