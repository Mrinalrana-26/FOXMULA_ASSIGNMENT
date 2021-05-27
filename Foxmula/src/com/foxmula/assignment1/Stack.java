/*
 * @author Mrinal Singh
 *
 *
 *Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and checkEmpty (
) operations on the stack. Create two stacks and write a menu-driven program to perform operations on
the two stacks. Whenever the number of elements in the two stacks becomes equal, a message should
automatically be generated displaying the number of elements in each stack.

 */
package com.foxmula.assignment1;

import java.util.Scanner;


public class Stack {
	private int []s;
	private int top,max;
	Stack(int size)
	{
		max=size;
		s=new int[max];
		top=-1;
	}
	void push(int data)
	{
		if(top==max)
		{
			System.out.print("Stack is Full\n");
		}
		else
		{
			s[++top]=data;
		}
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.print("Stack is EMPTY\n");
			return 0;
		}
		else
		{
			return s[top--];
		}
	}
	public int count()
	{
		if(top>-1)
			return top+1;
		else
			return 0;
	}
	public static void display(Stack st1,Stack st2)
	{
		if(st1.count()==st2.count())
		{
			System.out.println("Total Numbers of Elements in both stack is : " + st1.count());
		}


}
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Stack s1=new Stack(20);
		Stack s2=new Stack(20);
		int a,data;
		while(true)
		{
			System.out.println("\n1. Push in Stack 1");
			System.out.println("2. Pop in Stack 1");
			System.out.println("3. Push in Stack 2");
			System.out.println("4. Pop in Stack 2");
			System.out.println("Enter Your Choice : ");
			a=sc.nextInt();
			switch(a)
			{
				case 1:
					System.out.println("Enter The Data");
					data=sc.nextInt();
					s1.push(data);
					display(s1,s2);
				break;
				case 2:
					System.out.println(s1.pop());
					display(s1,s2);
				break;
				case 3:
					System.out.println("Enter The Data");
					data=sc.nextInt();
					s2.push(data);
					display(s1,s2);
				break;
				case 4:
					System.out.println(s2.pop());
					display(s1,s2);
				break;
				default:
					System.exit(0);
					break;
			}
			sc.close();
	}
		
	}
	
}
