package guviprogram;

import java.util.Scanner;

public class SeperateNoSquare {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num;
	num=sc.nextInt();
	int rem = 0;
	int sto=0;;
	while(num!=0){
		rem=num%10;
		sto+=rem*rem;
		num=num/10;
		//System.out.println(num);
	}
	System.out.println(sto);
}
}
