package guviprogram;

import java.util.Scanner;

public class CommenNoPrint {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
    int num[]=new int[3];
    int numm[]=new int[3];
    int hh[]=new int[2];
    int k=0;
    for(int i=0;i<num.length;i++){
    	num[i]=sc.nextInt();
    }
    for(int j=0;j<numm.length;j++){
    	numm[j]=sc.nextInt();
    }
    for(int x=0;x<num.length;x++){
    	for(int y=0;y<numm.length;y++){
    		if(num[x]==numm[y]){
    		hh[k]=num[x];
    		
    			System.out.println(hh[k]);k++;
    	
    		}
    		
    	}
    }
}
}
