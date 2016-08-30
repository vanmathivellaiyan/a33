package guviprogram;

import java.util.Scanner;

public class DateCheck {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String str="";
	str=sc.nextLine();
	String st[]=str.split("/");
	if(Integer.parseInt(st[0])>=1&& Integer.parseInt(st[0])<=31&&
	Integer.parseInt(st[1])>=1&& Integer.parseInt(st[1])<=12&&
	Integer.parseInt(st[2])<=2016){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}
}
}
