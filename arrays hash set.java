/*
Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 
*/
import java.util.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1[]=sc.nextLine().split(" ");
		String s2[]=sc.nextLine().split(" ");
		
		Set<Integer> hasmap=new HashSet();

		for(int i=0;i<s1.length;i++){
		    hasmap.add(Integer.parseInt(s1[i]));
		}
		for(int i=0;i<s2.length;i++){
		    hasmap.add(Integer.parseInt(s2[i]));
		}
		for(int i: hasmap){
		    System.out.print(i+" ");
		    
		}
		
	}
}
