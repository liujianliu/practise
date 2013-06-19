package com.duokan.severPerformance;

public class PrintAllSequence {

  //打印全排列基本思路：
	private static void printAll(char[] input,int length,int start)
	{
		if(start==length-1)
		{
				System.out.print(input);
				System.out.print("\n");
				return ;
		}
		for(int i =start;i<length;i++)
		{
			swap(input,start,i);
			printAll(input,length,start+1);//将第一个字母与之后每一个交换，打印出来
			swap(input,start,i);
		}
	}
	private static  void swap(char[] input ,int i,int j)
	{
		char tem = input[i];
		input[i]=input[j];
		input[j]=tem;
	}
	
	public static void main(String args[])
	{
		char[] input ={'a','b','c','d'};
		printAll(input,4,0);
	}

}
