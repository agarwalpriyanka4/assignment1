package com.example.mission;

public class home {

	public static void main(String[] args) {
    int i,j;
		int n=10;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i+j<=(n-1)/2||i==0||i==n-1||j==0||j==n-1||j-i>=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

	}
		

}
}
