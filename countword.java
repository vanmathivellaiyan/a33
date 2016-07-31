package guviprogram;

import java.util.Scanner;

public class countword {
	public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println("Size of the string is "+s.length());
        int res=count(s);
        System.out.println("No  String --->>"+"  "+s+" "+"is"+" :"+res);
    }


    private static int count(String s) {
        
        int count=0;
        if(s.charAt(0)!=' '){
            count++;
        }
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)==' ')){
                count++;
            }
        }
        return count;
    }


}

