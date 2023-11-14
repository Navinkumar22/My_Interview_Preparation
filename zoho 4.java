/*
Eg 1: Input: 12345
       Output:
1       5
  2   4
    3
  2  4
1      5

Eg 2: Input: geeksforgeeks
         Output:
g                         s
  e                     k
    e                 e
      k             e
        s         g
          f      r
             o
          f     r
        s         g
      k             e
    e                 e
  e                      k
g                          s 

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=s.length(),k=l-1,p=0;
		for(int i=1;i<=l;i++){
		    for(int j=1;j<=l;j++){
		        if(i==j){
		            System.out.print(s.charAt(p++));
		            if(i+j==l+1)k--;
		        }else if(i+j==l+1){
		            System.out.print(s.charAt(k--));
		        }else{
		            System.out.print(" ");
		        }
		    }System.out.println("");
		}
	}
}
