package com.example.mission;

public class ineuron {
	public static void main(String[] args) {
int i,j;
int n=10;
	for(i=0;i<n;i++)
	{
		 // I
		for(j=0;j<n;j++)
		{
			if(j==0)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		// N
		for(j=0;j<n;j++)
		{
			if(j==0||(j==n-1)||i==j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\t");
		// E
		for(j=0;j<n;j++)
		{
			if(j==0||i==0||i==(n-1)||i==(n-1)/2)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\t");
		//U
		for(j=0;j<n;j++)
		{
			if(j==0||(j==n-1)||(i==n-1))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\t");
		//R
		for(j=0;j<n;j++)
				{
					if(j==0||(i==0&&j<n-1)||(i==(n-1)/2&&j<(n-1))||(j==n-1&&i>0&&i<(n-1)/2)||i-j==(n-1)/4)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("\t");
		//O
		for(j=0;j<n;j++)
		{
					if((j==0&&i>0&&i<n-1)||(j==n-1&&i>0&&i<n-1)||(i==0&&j>0&&j<n-1)||(i==n-1&&j>0&&j<n-1))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("\t");
		//N
		for(j=0;j<n;j++)
			{
			if(j==0||(j==n-1)||i==j)
				{
				System.out.print("*");
				}
				else
				 {
				System.out.print(" ");
				}
			}
				System.out.print("\t");
		System.out.println();
	}
	
}
}
