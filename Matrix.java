package com.mindtree.engineeringcamp.classes;
import java.util.Scanner;
public class Matrix {
	Scanner s=new Scanner(System.in);
	int rows;
	int cols;
	public int getRows()
	{
		rows=3;
		return rows;
	}
	public int getCols()
	{
		cols=3;
		return cols;
	}
	public void setMatrix(int[][] a,int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
	}
	public boolean add(int[][] a,int[][] b,int r,int c)
	{
		int flag=0;
		int[][] d=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				d[i][j]=a[i][j]+b[i][j];
				flag=1;
			}
		}
		if(flag==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int[][] mul(int[][] a,int[][] b,int r,int c)
	{
		int[][] d=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				d[i][j]=a[i][j]*b[i][j];
			}
		}
		return d;
	}

}
