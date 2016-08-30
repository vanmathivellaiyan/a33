package guviprogram;

import java.util.Scanner;

public class StringReverseOPe {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String str="";
	str=sc.nextLine();
	String st="";
	char ch='-';
	for(int i=str.length()-1;i>=0;i--){
		st=st+str.charAt(i)+ch;
	}
	System.out.println(st);
}
}