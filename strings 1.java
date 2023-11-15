/*
Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
*/
import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next(),str2=sc.next();
		if(str1.length()<str2.length()){
		    System.out.print("Cannot Determine");
		    return;
		}
		int k=0;
		for(int i=0;i<str1.length();i++){
		    while(k<str2.length() && k+i<str1.length() && str1.charAt(i+k)==str2.charAt(k)){
		        k++;
		    }
		    if(k==str2.length()){
		       System.out.print(i);
		       return;
		    }else{
		        k=0;
		    }
		    
		}
		System.out.print(-1);
		
	}
}
