package pabbozvyshnavi_designprinciples;

import java.util.Scanner;

public class Epam_task3 {
	public static void display(int res) {
		System.out.println(res);
	}
	public static int add(int p,int q) {
		return p+q;
	}
	public static int sub(int p,int q) {
		return p-q;
	}
	public static int mul(int p,int q) {
		return p*q;
	}
	public static int div(int p,int q) {
		return p/q;
	}
	public static int mod(int p,int q) {
		return p%q;
	}
	public static void operation(char ch,int x,int y) {
		int ans=0;
		int flag=1;
		if(ch=='+') {
			ans=add(x,y);
					}
		else if(ch=='-') {
			ans=sub(x,y);
		}
		else if(ch=='*') {
			ans=mul(x,y);
		}
		else if(ch=='/') {
			if(y!=0) {
				ans=div(x,y);
			}
			else {
				System.out.println("Operation is not possible with divisor 0");
				flag=0;
			}
		}
		else if(ch=='%') {
			if(y!=0) {
			ans=mod(x,y);
			}
			else {
				System.out.println("Operation is not possible with divisor 0");
				flag=0;
			}
			
		}
		else {
			flag=0;
			System.out.println("Please enter arithmetic operator");
		}
		if(flag==1) {
			display(ans);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter operands");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("enter arithmetic operator");
		char ch=(obj.next()).charAt(0);
		operation(ch,a,b);

	}

}
