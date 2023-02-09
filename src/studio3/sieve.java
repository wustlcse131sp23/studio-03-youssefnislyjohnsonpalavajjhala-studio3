package studio3;

import java.util.Scanner;

public class sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("what is n?");
		int n = in.nextInt();
		boolean[] array = new boolean[n+1];
	for (int i = 0; i <=n;i++)
	{
		array[i]=true;
		//System.out.println(array[i]);
	}
	int sqrtn=(int) Math.ceil(Math.sqrt(n));
	for (int i = 2; i <=sqrtn;i++)
	{
		if (array[i]==true)
		{
			for (int j=i*i;j<=(n);j=j+i)
			{
				array[j]=false;
			}
		}
	}
	for (int i = 2; i <=n;i++)
	{
		if (array[i]==true)
		{
			//System.out.println(array[i]);
			System.out.println(i +" is prime");

		}
	}
}
}
